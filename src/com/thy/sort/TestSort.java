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
        //进行直接排序
        insertTwoSort(arr);
        //输出有序数组
        System.out.println("排序后："+Arrays.toString(arr));
    }

    private static void insertTwoSort(int[] a) {
        int n = a.length;
        int i,j;
        for (i=1;i<n;i++){
            int temp =a[i];
            int low =0;
            int high =i-1;
            while (low<=high){
                int mid = (low+high)/2;
                if (a[mid]>temp){
                    high =mid-1;
                }else
                    low = mid+1;
            }
            for (j=i-1;j>=low;j--){
                a[j+1] = a[j];
            }
            a[low] = temp;
        }
    }


}
