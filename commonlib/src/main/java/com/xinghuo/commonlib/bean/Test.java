package com.xinghuo.commonlib.bean;

/**
 * @author greensun
 *
 * @date 2019/1/8
 *
 * @desc
 */
public class Test {
    private String name;
    private int age;

    public Test() {
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
