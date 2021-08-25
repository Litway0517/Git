package com.myMethod;

/**
 * 方法演示
 *
 * @author DELL_
 * @date 2021-08-25
 */


public class MethodDemo {
    public static void main(String[] args) {

        // 调用方法
        isEvenNumber();
        isEvenNumber02(10);

    }

    private static void isEvenNumber() {
        int num = 10;
        num = 9;

        if (num % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void isEvenNumber02(int number) {
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
