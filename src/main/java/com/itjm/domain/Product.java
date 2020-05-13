package com.itjm.domain;

import com.itjm.utils.DateUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String id;

    private String productnum;

    private String productname;

    private String cityname;

    private Date departuretime;

    private String departuretimestr;

    private BigDecimal productprice;

    private String productdesc;

    private Integer productstatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductnum() {
        return productnum;
    }

    public void setProductnum(String productnum) {
        this.productnum = productnum == null ? null : productnum.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public BigDecimal getProductprice() {
        return productprice;
    }

    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    public String getDeparturetimestr() {
        if (departuretime!=null){
            departuretimestr=DateUtils.date2String(departuretime,"yy-MM-dd HH-mm-ss");
        }
        return departuretimestr;
    }

    public void setDeparturetimestr(String departuretimestr) {
        this.departuretimestr = departuretimestr;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productnum='" + productnum + '\'' +
                ", productname='" + productname + '\'' +
                ", cityname='" + cityname + '\'' +
                ", departuretime=" + departuretime +
                ", departuretimestr='" + departuretimestr + '\'' +
                ", productprice=" + productprice +
                ", productdesc='" + productdesc + '\'' +
                ", productstatus=" + productstatus +
                '}';
    }
}