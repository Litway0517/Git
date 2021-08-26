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

        // 创建集合
        ArrayList<String> array = new ArrayList<String>();

        array.add("左冷禅");
        array.add("风清扬");
        array.add("东方不败");
        array.add("hot-fix 分支更新");
        array.add("hot-fix 分支第二次更新");

        for (String s : array) {
            System.out.println(s);
        }
    }
}
