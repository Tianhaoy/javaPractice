package com.thy.sort;

import java.util.Arrays;

/**
 * @Description: TODO（希尔排序排序算法）
 * @Author 在无人区看超市
 * @Date 2020年5月14日 19:32:48
 */

public class ShellSort {
    public static void main(String[] args) {
        new ShellSort().run();
    }
    private void run() {
        int a[] = {64,45,15,2,31,16,9,7};
        System.out.println("——希尔 排序算法———");
                System.out.println("排序前:");
        System.out.println(Arrays.toString(a));
        System.out.println("排序规律动态变化:");
        shellSort2(a);
        printResult(a,a.length);
        System.out.println("排序后:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    /**
     * 希尔排序(缩小增量法) 属于插入类排序
     * 不稳定
     * @param a
     */
    private void shellSort(int[] a){
        int n=a.length;
        int gap=n/2;
        while(gap>=1){
            for(int i=gap;i<a.length;i++){
                int j=0;
                int temp = a[i];
                for(j=i-gap;j>=0 && temp<a[j];j=j-gap){
                    a[j+gap] = a[j];
                }
                a[j+gap] = temp;
            }
            printResult(a,a.length);
            gap = gap/2;
        }
    }
    /**
     * 严格按照定义来写的希尔排序
     * @param a
     */
    private void shellSort2(int[] a){
        int n=a.length;
        int i,j,k,gap;
        for(gap=n/2;gap>0;gap/=2){
            for(i=0;i<gap;i++){
                for(j=i+gap;j<n;j+=gap){
                    int temp = a[j];
                    for(k=j-gap;k>=0 && a[k]>temp;k-=gap){
                        a[k+gap]=a[k];
                    }
                    a[k+gap]=temp;
                }
            }
            printResult(a,a.length);
        }
    }
    private void printResult(int[] a, int n){
        for(int j=0;j<n;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println();
    }
}
