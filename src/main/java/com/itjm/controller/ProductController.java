package com.itjm.controller;

import com.itjm.domain.Message;
import com.itjm.domain.Product;
import com.itjm.service.ProductService;
import com.itjm.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.util.*;

/**
 * @author 靳明
 * @Description:产品
 * @date 2020/5/10  13:21
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    private static Logger log = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    public ProductService productService;



    /*
     * 功能描述: <br>
     * 〈查询全部产品〉
     * @Param: []
     * @Return: org.springframework.web.servlet.ModelAndView
     * @Author: 靳明
     * @Date: 2020/5/17 10:33
     */
    @RequestMapping("/findAllProduct")
    public ModelAndView findAll(){
        ModelAndView mv=new ModelAndView();
        List<Product> products = productService.selectAll();
        mv.addObject("products",products);
        mv.setViewName("success");
        return mv;
    }

    /*
     * 功能描述: <br>
     * 〈添加产品〉
     * @Param: [model, product]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/17 10:33
     */
    @RequestMapping("/addProduct")
    public String addProduct(Model model, Product product) throws ParseException {
        log.info(product.toString());
        Message msg=new Message();
        Date date=DateUtils.string2Date(product.getDepartureTimeStr(),"yyyy-MM-dd HH:mm:ss");
        if (product!=null) {
            String id = UUID.randomUUID().toString();
            product.setId(id);
            product.setDepartureTime(date);
            productService.addProduct(product);
            msg.setSuccessMessage("添加成功");
        }else {
            msg.setErrorMessage("添加失败");
        }
        model.addAttribute("msg",msg);
        return "redirect:/admin/product_list?page=1";
    }


    /*
     * 功能描述: <br>
     * 〈修改产品信息〉
     * @Param: [model, product]
     * @Return: java.lang.String
     * @Author: 靳明
     * @Date: 2020/5/17 10:33
     */
    @RequestMapping("/updateProduct")
    public String updateProduct(Model model, Product product) throws ParseException {
        Message msg=new Message();
        Date date=DateUtils.string2Date(product.getDepartureTimeStr(),"yyyy-MM-dd HH:mm:ss");
        if (product!=null) {
            product.setDepartureTime(date);
            productService.updateProduct(product);
            msg.setSuccessMessage("修改成功");
        }else {
            msg.setErrorMessage("修改失败");
        }
        model.addAttribute("msg",msg);
        return "redirect:/admin/product_list?page=1";
    }

    /*
     * 功能描述: <br>
     * 〈产品启用或禁用〉
     * @Param: [id, status]
     * @Return: java.util.Map<java.lang.String,java.lang.String>
     * @Author: 靳明
     * @Date: 2020/5/17 10:32
     */
    @RequestMapping("/updateProductStatus/{id}/{status}")
    @ResponseBody
    public Map<String,String> updateProductStatus(@PathVariable("id") String id,@PathVariable("status") int status){
        Map<String,String> map=new HashMap<String,String>();
        Product product=new Product();
        product.setId(id);
        product.setProductStatus(status);
        if (productService.updateProductStatus(product)!=0){
            map.put("success","true");
            map.put("msg",status==0?"禁用成功":"启用成功");
        }else {
            map.put("success","false");
            map.put("msg",status==0?"禁用失败":"启用失败");
        }
        return map;
    }

    @RequestMapping("/deleteProductByPrimaryKey/{id}")
    @ResponseBody
    public Map<String,String> deleteProductByPrimaryKey(@PathVariable("id") String id){
        Map<String,String> map=new HashMap<String, String>();
        if (productService.delateProductByPrimaryKey(id)!=0){
            map.put("success","true");
            map.put("msg","删除成功");
        }else {
            map.put("success","false");
            map.put("msg","删除失败");
        }
        return map;
    }



    @RequestMapping("/aa")
    public String toIndex(){
        return "index";
    }
}
