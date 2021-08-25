package com.atguitu.git;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * git测试
 *
 * @author DELL_
 * @date 2021-08-25
 */


public class GitTest {
    public static void main(String[] args) {
        System.out.println("这里是测试Git的一个java文件. ");

        // 创建集合
        ArrayList<String> array = new ArrayList<String>();
        array.add("左冷禅");
        array.add("风清扬");
        array.add("刘正风");

        Iterator<String> it = array.iterator();
        while ((it.hasNext())) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");


        // 创建学生集合
        ArrayList<Student> arr = new ArrayList<Student>();

        // 创建学生对象
        Student s1 = new Student("风清扬", 33);
        Student s2 = new Student("左冷禅", 33);
        Student s3 = new Student("东方不败", 35);
        Student s4 = new Student("吕布", 29);
        Student s5 = new Student("TUG", 100);
        Student s6 = new Student("天津工业大学-计算机科学与技术学院", 110);
        Student s7 = new Student("天津工业大学", 110);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);

        for (Student s : arr) {
            String str = s.getName() + ", " + s.getAge();
            System.out.println(str);
        }

    }

}
