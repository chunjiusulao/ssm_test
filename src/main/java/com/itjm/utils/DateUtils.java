package com.itjm.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 靳明
 * @Description: 日期工具类
 * @date 2020/5/12  19:36
 */
public class DateUtils implements Converter<String,Date> {

    //日期转换成字符串
    public static String date2String(Date date, String pattern){
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        String format = sdf.format(date);
        return format;
    }

    //字符串转换成日期
    public static Date string2Date(String str,String pattern) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date = sdf.parse(str);
        return date;
    }

    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    public Date convert(String source) {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = null;
        try {
            if (source!=null)
            date = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
