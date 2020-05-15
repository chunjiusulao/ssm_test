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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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



    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv=new ModelAndView();
        List<Product> products = productService.selectAll();
        mv.addObject("products",products);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/add")
    public String add(Model model, Product product) throws ParseException {
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

    @RequestMapping("/aa")
    public String toIndex(){
        return "index";
    }
}
