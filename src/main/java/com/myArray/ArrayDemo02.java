package com.myArray;

import java.util.ArrayList;

/**
 * 数组demo02
 *
 * @author DELL_
 * @date 2021-08-26
 */


public class ArrayDemo02 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("master分支更新");
        array.add("master再次更新");
        array.add("更新本地的user.name和user.email");
        array.add("master 更新一次");
        array.add("master 连续更新两次");
        array.add("修改了user.name与user.email, 之后, GitHub开始统计commits与contributors");


        for (String s : array) {
            System.out.println(s);
        }
    }
}
