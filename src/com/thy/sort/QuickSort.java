package com.thy.sort;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;

/**
 * @Description: TODO(快速排序算法)
 * @Author ASUS
 * @Date 2020/3/8 1:35
 * 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据
 * 都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快
 * 速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 */
public class QuickSort {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new QuickSort().run();
    }

    public void run() {
        int a[] = {64, 45, 15, 2, 31, 16, 9, 7};
        int n = a.length;
        System.out.println("———快速排序算法————");
        System.out.println("排序前:");
        System.out.println(Arrays.toString(a));
        if (n > 0) {
            quickSort(a, 0, n - 1);
        }
        System.out.println("排序后:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * 快速排序
     * 快速排序 时间复杂度为 O(NlogN).
     */
    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            // 将数组 a 一分为二
            int middle = getMiddle(a, low, high);
            //将小于基准元素的数据进行递归排序
            quickSort(a, low, middle - 1);
             //将大于基准元素的数据进行递归排序
            quickSort(a, middle + 1, high);
        }
    }

    public int getMiddle(int[] list, int low, int high) {
        //数组的第一个数为基准元素
        int temp = list[low];
        while (low < high) {
            while (low < high && list[high] > temp) {
                high--;
            }
             // 比基准小的数据移到低端
            list[low] = list[high];
            while (low < high && list[low] < temp) {
                low++;
            }
             // 比基准大的记录移到高端
            list[high] = list[low];
        }
         // 此时 low == high
        list[low] = temp;
        return low;
    }
}
