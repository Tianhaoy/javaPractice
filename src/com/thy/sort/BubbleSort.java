package com.thy.sort;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @Description: TODO（冒泡排序算法）
 * @Author
 * @Date 2019/9/24 20:04
 * 依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一
 * 趟：首先比较第 1 个和第 2 个数，将小数放前，大数放后。然后比较第 2 个数和
 * 第 3 个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放
 * 前，大数放后。重复第一趟步骤，直至全部排序完成。
 * 冒泡排序的最坏时间复杂度为：O(n2) 。
 * 综上所述 ：冒泡排序总的平均时间复杂度为：O(n2) 。
 */
public class BubbleSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr = {56,54,2,1,78,61,72,43,64,25,39,96,82};
        //输出无序数组
        System.out.println("排序前："+Arrays.toString(arr));
        //进行冒泡排序
        bubbleSort(arr);
        //输出有序数组
        System.out.println("排序后："+Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n =arr.length;
        //外层循环控制排序趟数
        for (int i=0;i<n-1;i++){
            //内层循环控制每一趟排序多少次
            for (int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
