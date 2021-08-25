package com.atguitu.git;

/**
 * 学生
 *
 * @author DELL_
 * @date 2021-08-25
 */


public class Student {
    /**
     * 的名字
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
}
