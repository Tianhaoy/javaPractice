package com.thy.sort;

import java.util.Arrays;

/**
 * @Description: TODO(归并排序算法)
 * @Author 在无人区看超市
 * @email 2469653218@qq.com
 * @Date 2020/5/19 22:29
 * @link https://github.com/Tianhaoy
 * 归并排序的最坏时间复杂度为：O(nlogn) 。
 * 综上所述 ：归并排序总的平均时间复杂度为：O(nlogn)
 */
public class MergeSort {
    public static void main(String[] args) {
        //给出无序数组
        int[] arr = {6, 8, 4, 9, 10, 1, 5, 2, 7, 3};
        //输出无序数组
        System.out.println("排序前：" + Arrays.toString(arr));
        //进行希尔排序
        int n = arr.length;
        sort(arr, 0, n - 1);
        //输出有序数组
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    public static void sort(int arr[], int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        if (low < high) {
            /**
             * 对左边排序
             */
            sort(arr, low, mid);
            /**
             * 对右边排序
             */
            sort(arr, mid + 1, high);
            /**
             * 左右归并
             */
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int [] temp = new int[high-low+1];
        /**
         * 左指针
         */
        int i = low;
        /**
         * 右指针
         */
        int j = mid+1;
        int k=0;
        /**
         * 先把较小的数移到新数组中
         */
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        /**
         * 把左边剩余的数移入新数组
         */
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        /**
         * 把右边剩余的数移入新数组
         */
        while(j<=high){
            temp[k++] = arr[j++];
        }
        /**
         * 用新数组中的数覆盖 arr 数组
         */
        for(int k2=0;k2<temp.length;k2++){
            arr[k2+low] = temp[k2];
        }
    }
}
