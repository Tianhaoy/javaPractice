package com.thy.nowCoder;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 皓宇QAQ
 * @email 2469653218@qq.com
 * @Date 2020/4/28 18:57
 * @link https://github.com/Tianhaoy
 * @Description:
 */
public  class javaTest {

    public void add(Byte b)
    {
        b = b++;
    }
    public void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }
    public static void main(String[] args) {
        new javaTest().test();
    }
}


