package com.thy.sort;

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
        int [] arr = {45,12,64,3,15,98,46};
        int n = arr.length;
        System.out.println("排序前顺序：");
        for (int num:arr){
            System.out.print(num+" ");
        }
        for (int i=0;i<n-1;i++){// 做第 i 趟排序
            int min =i;
            for (int j=i+1;j<n;j++){// 选最小的记录
                if (arr[j]<arr[min]){
                    min = j;//记下目前找到的最小值所在的位置
                }
            }
            //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
            if (i!=min){ //交换 a[i]和 a[min]
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println();
        System.out.println("排序后顺序：");
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
