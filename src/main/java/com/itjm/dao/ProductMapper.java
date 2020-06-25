package com.itjm.dao;

import com.itjm.domain.Product;

import java.util.List;


public interface ProductMapper {
    int deleteByPrimaryKey(String id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectAll();

    List<Product> selectInspectAll();

    int updateStatusByPrimaryKey(Product product);
}