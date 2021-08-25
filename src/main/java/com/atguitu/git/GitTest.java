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

    }

}
