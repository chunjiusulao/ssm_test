package com.itjm.controller;

import com.itjm.domain.Log;
import com.itjm.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.UUID;

/**
 * @author 靳明
 * @Description: 日志
 * @date 2020/5/15  19:19
 */
@Component
@Aspect
public class SysLog {
    private static Logger logger= LoggerFactory.getLogger(SysLog.class);

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private LogService logService;

    private Date startTime;//开始时间
    private Class clazz;//访问的类
    private Method method;//访问的方法


    //前置通知：主要获取开始时间，执行的类是哪一个，执行的是哪一个方法
    @Before("execution(* com.itjm.controller.*.*(..))")
    public void doBefore(JoinPoint joinPoint) throws NoSuchMethodException {
        startTime=new Date();
        clazz=joinPoint.getTarget().getClass();//获取当前访问的类对象
        MethodSignature methodName= (MethodSignature) joinPoint.getSignature();//获取访问的方法
        Object[] args = joinPoint.getArgs();//获取访问方法的参数
        logger.info("11111111111111111111111"+clazz);


        /*//获取具体执行的方法的Method对象
        if (args==null||args.length==0){
            method=clazz.getMethod(methodName);//根据获取的方法名获取方法（只能获取无参数方法）
        }else {
            Class[] classes=new Class[args.length];
            for (int i=0;i<classes.length;i++){
                classes[i]=args[i].getClass();
            }
            method = clazz.getMethod(methodName, classes);
        }*/
        method=methodName.getMethod();
        logger.info("222222222222222222222"+method.getAnnotation(RequestMapping.class));

    }


    //后置通知
    @After("execution(* com.itjm.controller.*.*(..))")
    public void doAfter(JoinPoint joinPoint){
        long time=new Date().getTime()-startTime.getTime();// 获取访问时长
        String url = null;//获取url
        String[] methodValue = new String[0];

        //获取url
        if (clazz!=null||method!=null||clazz!= SysLog.class){

            //获取类上的注解值
            RequestMapping clazzAnnotation = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
            if (clazzAnnotation!=null){
                String[] clazzValue = clazzAnnotation.value();
                logger.info("========================================="+clazzAnnotation);

                //获取方法上的注解值
                RequestMapping methodAnnotation = method.getAnnotation(RequestMapping.class);

                if (methodAnnotation!=null){
                    methodValue = methodAnnotation.value();
                    url=clazzValue[0]+methodValue[0];
                }
            }
        }
        logger.info("==============================================");
        logger.info(methodValue[0]);

        //获取访问的ip地址
        String ip=request.getRemoteAddr();
        String userName;
        if (methodValue[0].equals("/register")){
            userName="aaa";
        }
        else {
        //获取当前操作的用户(第一种方式)
        SecurityContext context=null;
        context= SecurityContextHolder.getContext();//从上下文中获取当前登陆的用户
        User user = (User) context.getAuthentication().getPrincipal();
            userName=user.getUsername();
        }
        //第二种方式
        //User user= (User) request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");


        logger.info("==================================================================================]");
        logger.info(String.valueOf(time));
        logger.info(ip);
        logger.info(userName);
        logger.info(url);
        logger.info(String.valueOf(startTime));
        logger.info("[类名]"+clazz.getName()+"[方法名]"+method.getName());
        Log log=new Log();
        log.setExecutionTime(time);
        log.setId(UUID.randomUUID().toString());
        log.setIp(ip);
        log.setUserName(userName);
        log.setVisitTime(startTime);
        log.setUrl(url);
        log.setMethod("[类名]"+clazz.getName()+"[方法名]"+method.getName());
        logService.insertLog(log);
    }


}
