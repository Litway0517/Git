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

        for (String s : array) {
            System.out.println(s);
        }
    }
}
