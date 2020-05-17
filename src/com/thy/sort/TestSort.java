package com.thy.sort;

import java.util.Arrays;


/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 在无人区看超市
 * @Date 2020年5月14日 19:32:06
 */
public class TestSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr = {6,8,4,9,10,1,5,2,7,3};
        //输出无序数组
        System.out.println("排序前："+ Arrays.toString(arr));
        //进行希尔排序
        shellSort2(arr);
        //输出有序数组
        System.out.println("排序后："+Arrays.toString(arr));
    }

    private static void shellSort2(int[] arr) {
        int n =arr.length;
        int i,j,k,gap;
        for (gap=n/2;gap>0;gap/=2){
            for (i=0;i<gap;i++){
                for (j=i+gap;j<n;j+=gap){
                    int temp = arr[j];
                    for (k=j-gap;k>0 && arr[k]>temp;k-=gap){
                        arr[k+gap] =arr[k];
                    }
                    arr[k+gap] =temp;
                }
            }
            printResult(arr,arr.length);
        }
    }


    private static void printResult(int[] a, int n){
        for(int j=0;j<n;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println();
    }
}
