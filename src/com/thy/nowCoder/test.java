package com.thy.nowCoder;

import java.util.Scanner;

public class test {
    /*DecimalFormat df = new DecimalFormat("0.000000");
    String s = df.format(noGold);*/
    public static void main(String[] args) {
        //已知，1000个硬币里有10个金币。随机的取出n个硬币，则取出硬币里有金币的概率为多少?
        //用例 1 输出 0.010000
        //用例 999 输出1.000000
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 990) {
            System.out.println("1.000000");
        } else {
            int a1 = 1, a2 = 1;
            if (n <= 10) {
                for (int i = 0; i < n; i++) {
                    a1 *= (990 - i);
                    a2 *= (1000 - i);
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    a1 *= (990 - n + i);
                    a2 *= (1000 - i);
                }
            }
            float noGold= (float)a1/a2;
            double p = 1 - noGold;
            String str = String.format("%.6f", p);
            System.out.println(str);
        }
    }
}

