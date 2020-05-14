package com.thy.sort;

import java.util.Arrays;

/**
 * @Description: TODO(直接插入排序算法的优化 ： 折半查找 / 二分查找)
 * @Author 在无人区看超市
 * @Date 2020年5月14日 19:31:50
 * 折半插入算法是对直接插入排序算法的改进，排序原理同直接插入算法：
 * 把 n 个待排序的元素看成一个有序表和一个无序表，开始时有序表中只有一
 * 个元素，无序表中有 n-1 个元素；排序过程即每次从无序表中取出第一个元素，
 * 将它插入到有序表中，使之成为新的有序表，重复 n-1 次完成整个排序过程。
 * 与直接插入算法的区别在于：在有序表中寻找待排序数据的正确位置时，使
 * 用了折半查找/二分查找。
 */
public class InsertTwoSort {
    public static void main(String[] args) {
        //给出无序数组
        int [] arr = {6,8,4,9,10,1,5,2,7,3};
        //输出无序数组
        System.out.println("排序前："+ Arrays.toString(arr));
        //进行直接排序
        binaryInsertSort(arr);
        //输出有序数组
        System.out.println("排序后："+Arrays.toString(arr));
    }

    private static void binaryInsertSort(int[] a) {
        int n = a.length;
        int i, j;
        for (i = 1; i < n; i++) {
            //temp 为本次循环待插入有序列表中的数
            int temp = a[i];
            int low = 0;
            int high = i - 1;
            //寻找 temp 插入有序列表的正确位置，使用二分查找法
            while (low <= high) {
                //有序数组的中间坐标，此时用于二分查找，减少查找次数
                int mid = (low + high) / 2;
                //若有序数组的中间元素大于待排序元素，则有序序列向中间元素之前搜索，否则向后搜索
                if (a[mid] > temp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for (j = i - 1; j >= low; j--) {
                //元素后移，为插入 temp 做准备
                a[j + 1] = a[j];
            }
            //插入 temp
            a[low] = temp;
            //打印每次循环的结果
            print(a, n, i);
        }

    }

    private static void print(int[] a, int n, int i) {
        System.out.print("第" + i + "次：");
        for (int j = 0; j < n; j++) {
            System.out.print(" " + a[j]);
        }
        System.out.println();
    }
}
