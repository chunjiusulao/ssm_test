package com.itjm.service;

import com.itjm.domain.Product;

import java.util.List;

/**
 * @author 靳明
 * @Description:
 * @date 2020/5/10  13:24
 */
public interface ProductService {
    public List<Product> selectAll();

    public int addProduct(Product product);
}
