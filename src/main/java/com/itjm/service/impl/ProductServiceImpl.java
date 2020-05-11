package com.itjm.service.impl;

import com.itjm.dao.ProductMapper;
import com.itjm.domain.Product;
import com.itjm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 靳明
 * @Description:
 * @date 2020/5/10  13:24
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> selectAll() {
        List<Product> products = productMapper.selectAll();
        return products;
    }
}
