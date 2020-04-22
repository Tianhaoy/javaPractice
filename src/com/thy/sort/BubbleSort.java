package com.thy.sort;

/**
 * @Description: TODO（冒泡排序算法）
 * @Author ASUS
 * @Date 2019/9/24 20:04
 * 依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一
 * 趟：首先比较第 1 个和第 2 个数，将小数放前，大数放后。然后比较第 2 个数和
 * 第 3 个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放
 * 前，大数放后。重复第一趟步骤，直至全部排序完成。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15, 46, 78, 96, 5, 8, 34, 61};
        int n = arr.length;
        System.out.println("排序前：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < n-1; i++) {//外层循环控制排序趟数
            for (int j = 0; j < n -1-i; j++) {//内层循环控制每一趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
