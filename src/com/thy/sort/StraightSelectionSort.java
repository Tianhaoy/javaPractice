package com.thy.sort;

import java.util.Arrays;

/**
 * @Description: TODO（选择排序算法）
 * @Author thy
 * @Date 2019/9/23 21:02
 * 每一趟从待排序的记录中选出最小的元素，顺序放在已排好序的序
 * 列最后，直到全部记录排序完毕。也就是：每一趟在 n-i+1(i=1，2，„n-1)个
 * 记录中选取关键字最小的记录作为有序序列中第 i 个记录。基于此思想的算法主
 * 要有简单选择排序、树型选择排序和堆排序。
 * 选择排序的最坏时间复杂度为：O(n2) 。
 * 综上所述 ：选择排序总的平均时间复杂度为：O(n2) 。
 */
public class StraightSelectionSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr = {56,54,2,1,78,61,72,43,64,25,39,96,82};
        //输出无序数组
        System.out.println("排序前："+Arrays.toString(arr));
        //进行选择排序
        straightSelectionSort(arr);
        //输出有序数组
        System.out.println("排序后："+Arrays.toString(arr));
    }

    private static void straightSelectionSort(int[] arr) {
        int n =arr.length;
        for (int i=0;i<n-1;i++){ // 做第 i 趟排序
            int min =i;
            for (int j=i+1;j<n;j++){ // 选最小的记录
                if (arr[j]<arr[min]){
                    min =j; //记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i!=min){ //交换 a[i]和 a[min]
                int temp =arr[i];
                arr[i] =arr[min];
                arr[min] =temp;
            }
        }
    }
}
