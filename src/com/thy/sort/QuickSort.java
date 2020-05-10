package com.thy.sort;

import java.util.Arrays;

/**
 * @Description: TODO(快速排序算法)
 * @Author ASUS
 * @Date 2020年5月10日 21:52:05
 * 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据
 * 都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快
 * 速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 * 时间复杂度logN
 */
public class QuickSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr = {56,54,2,1,78,61,72,43,64,25,39,96,82};
        //输出无序数组
        System.out.println("排序前："+Arrays.toString(arr));
        //进行快速排序
        quickSort(arr);
        //输出有序数组
        System.out.println("排序后："+Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low<high){
            //分区操作，将一个数组分成两个分区，返回分区界限索引
            int midden = getMidden(arr,low,high);
            //对左分区进行快排 递归调用
            quickSort(arr, low, midden-1);
            //对右分区进行快排
            quickSort(arr, midden+1, high);
        }
    }

    private static int getMidden(int[] arr, int low, int high) {
        //指定左指针i和右指针j
        int i = low;
        int j = high;
        //将第一个数作为基准值。挖坑
        int x = arr[low];
        //使用循环实现分区操作
        while (i<j){
            //1.从右向左移动j，找到第一个小于基准值的值 arr[j]
            while (arr[j]>=x && i<j){
                j--;
            }
            //2.将右侧找到小于基准数的值加入到左边的（坑）位置， 左指针想中间移动一个位置i++
            if (i<j){
                arr[i] = arr[j];
                i++;
            }
            //3.从左向右移动i，找到第一个大于等于基准值的值 arr[i]
            while (arr[i]<x && i<j){
                i++;
            }
            //4.将左侧找到的打印等于基准值的值加入到右边的坑中，右指针向中间移动一个位置 j--
            if (i<j){
                arr[j]=arr[i];
                j--;
            }
        }
        //使用基准值填坑，这就是基准值的最终位置
        arr[i]=x;
        //返回基准值的位置索引
        return i;
    }
}
