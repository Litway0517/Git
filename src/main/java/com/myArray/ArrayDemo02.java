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
        array.add("不正确 -> 更改了GitHub上面的Primary Email邮箱为xmw0517@gmail.com, 那么应该不会显示contributors. 结论: 实际上仍会显示");

        array.add("不正确 -> 更改了本地Git的user.name为XMW之后, 再次push应该不会显示contributors. 仍然会显示");
        array.add("更改本地Git的user.email为xmw0517@163.com之后, 再次push应该不会显示contributors. ");



        for (String s : array) {
            System.out.println(s);
        }
    }
}
