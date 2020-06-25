package com.itjm.service;

import com.itjm.domain.Log;

import java.util.List;

/**
 * @author 靳明
 * @Description: 日志方法类
 * @date 2020/5/15  19:15
 */
public interface LogService {
    //添加日志
    public void insertLog(Log log);
    //查询日志
    public List<Log> selectLog();
}
