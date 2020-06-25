package com.itjm.dao;

import com.itjm.domain.Passenger;

public interface PassengerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Passenger record);

    int insertSelective(Passenger record);

    Passenger selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Passenger record);

    int updateByPrimaryKey(Passenger record);
}