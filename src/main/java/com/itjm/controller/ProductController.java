package com.itjm.controller;

import com.itjm.domain.Product;
import com.itjm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 靳明
 * @Description:
 * @date 2020/5/10  13:21
 */
@Controller
@RequestMapping("/product")
public class ProductController {
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
}
