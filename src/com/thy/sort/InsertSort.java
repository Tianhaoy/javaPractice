package com.thy.sort;

import java.util.Arrays;

/**
 * @Description: TODO(直接插入排序算法)
 * @Author 在无人区看超市
 * @Date 2020年5月14日 19:31:46
 * 把 n 个待排序的元素看成一个有序表和一个无序表，开始时有序表中只有一
 * 个元素，无序表中有 n-1 个元素；排序过程即每次从无序表中取出第一个元素，
 * 将它插入到有序表中，使之成为新的有序表，重复 n-1 次完成整个排序过程。
 * 直接插入排序的最坏时间复杂度为：O(n2) 。
 *  综上所述 ：直接插入排序总的平均时间复杂度为：O(n2)
 */
public class InsertSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr = {6,8,4,9,10,1,5,2,7,3};
        //输出无序数组
        System.out.println("排序前："+ Arrays.toString(arr));
        //进行直接插入排序
        insertSort(arr);
        //输出有序数组
        System.out.println("排序后："+Arrays.toString(arr));
    }
    public static void insertSort(int[] a){
        int n = a.length;
        int i,j;
        for (i=1;i<n;i++){
            //temp 为本次循环待插入有序列表中的数
            int temp = a[i];
            // 寻找 temp 插入有序列表的正确位置
            for (j=i-1;j>=0 && a[j]>temp;j--){
                //元素后移，为插入 temp 做准备
                a[j+1] = a[j];
            }
            //插入 temp
            a[j+1] = temp;
            Print(a,n,i);
        }
    }

    private static void Print(int[] a, int n, int i) {
        System.out.print("第"+i+"次：");
        for(int j=0;j<n;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println();
    }
}
