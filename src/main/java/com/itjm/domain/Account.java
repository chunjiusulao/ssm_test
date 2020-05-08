package com.itjm.domain;

import java.io.Serializable;

/**
 * @author 靳明
 * @Description:账户信息
 * @date 2020/5/6  11:02
 */
public class Account implements Serializable {

    private String id;
    private String name;
    private Double money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
