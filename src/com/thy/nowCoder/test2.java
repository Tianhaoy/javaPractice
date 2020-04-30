package com.thy.nowCoder;

import java.util.Scanner;

/**
 * @Author 皓宇QAQ
 * @email 2469653218@qq.com
 * @Date 2020/4/21 19:41
 * @link https://github.com/Tianhaoy/hanzomall
 * @Description:
 */
public class test2 {
    //有一对兔子，从出生后的第五个月起每月生出一对小兔子（即满4月就开始生小兔），小兔子也会出生从第五个月起每月生
    //一对小兔子。假如兔子不会死，第nge月时，兔群有多少对兔子。
    //输入 第n月 （n为自然数，n<101）
    // 输出 第n个月时，兔子的对数（兔群的兔子有多少对兔子）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(total(n));
    }

    private static int total(int n) {
        if (n <= 4) {
            return 1;
        } else
            return total(n - 1) + total(n - 4);
    }


}
