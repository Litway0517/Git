package com.myArray;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 数组测试
 *
 * @author DELL_
 * @date 2021-08-25
 */


public class ArrayTest {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);
        array.add(113);
        array.add(138);
        array.add(149);
        array.add(80);
        array.add(53);
        array.add(59);
        array.add(99);


        Collections.sort(array);
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
