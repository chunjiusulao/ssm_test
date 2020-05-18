package com.itjm.service;

import com.itjm.domain.Product;

import java.util.List;

/**
 * @author 靳明
 * @Description:产品方法类
 * @date 2020/5/10  13:24
 */
public interface ProductService {
    public List<Product> selectAll();

    public Product selectByPrimaryKey(String id);

    public int addProduct(Product product);

    public int updateProduct(Product product);

    public int updateProductStatus(Product product);

    public int delateProductByPrimaryKey(String id);
}
