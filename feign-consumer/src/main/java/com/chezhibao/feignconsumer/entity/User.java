/*
 * Copyright (C), 2018-2020,中间件开发工程师
 * FileName: User.java
 * Author:   Arshle
 * Date:     2018年04月06日
 * Description:
 */
package com.chezhibao.feignconsumer.entity;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class User{

    private String name;
    private int age;

    public User(){}

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[ name:" + name + ",age:" + age + " ]";
    }
}
