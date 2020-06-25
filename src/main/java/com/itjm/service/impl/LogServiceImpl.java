package com.itjm.service.impl;

import com.itjm.dao.LogMapper;
import com.itjm.domain.Log;
import com.itjm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 靳明
 * @Description: 日志方法实现类
 * @date 2020/5/15  19:16
 */
@Service("logService")
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    /*
     * 功能描述: <br>
     * 〈添加日志〉
     * @Param: [log]
     * @Return: int
     * @Author: 靳明
     * @Date: 2020/5/27 17:57
     */
    @Override
    public void insertLog(Log log) {
        logMapper.insert(log);
    }

    @Override
    public List<Log> selectLog() {
        List<Log> list=logMapper.selectLog();
        return list;
    }
}
