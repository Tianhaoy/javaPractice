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
public class javaTest {
    long g= 0xfffL;
    double d = 5.4545d;
    long var;
    public void javaTest(int param) { var = param; }//(1)
    public static void main(String[] args) {
        javaTest a, b;
        a =new javaTest();//(2)
        b =new javaTest();//(3)
    }

}

