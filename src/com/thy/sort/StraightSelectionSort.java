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
 */
public class StraightSelectionSort {
    public static void main(String[] args) {
        int [] arr = {95,56,12,86,76,156,83,31,2,64,85,25,34,65,4512,556};
        int n = arr.length;
        System.out.println("排序前\n"+ Arrays.toString(arr));

        //开始外层循环
        for (int i =0;i<n-1;i++){
            int min = i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            //结束内层循环 将最小的min放在i中
            if (i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min]= temp;
            }
        }
        System.out.println("排序后");
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
