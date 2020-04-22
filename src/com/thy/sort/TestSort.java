package com.thy.sort;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2020/3/8 15:03
 */
public class TestSort {
    public static void main(String[] args) {
        int [] a = {45,64,15,2,31,16,9,7};
        System.out.println("排序前：");
        for (int num:a){
            System.out.print(num+" ");
        }
        InsertSort InsertSort = new InsertSort();
        InsertSort.insertSort(a);
    }

    public void insertSort(int[] a) {
        System.out.println();
        System.out.println("——————直接插入排序算法——————");
        int n = a.length;
        int i,j;
        for (i=1;i<n;i++){
            int temp = a[i];
            for (j=i+1;j>=0 && a[j]>temp;j--){
                a[j+1]=a[j];
            }
            a[j]= temp;
            Print(a,n,i);
        }
        printResult(a,n);
    }

    private void printResult(int[] a, int n) {
        System.out.println("最终排序结果：");
        for (int j=0;j<n;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println();
    }

    private void Print(int[] a, int n, int i) {
        System.out.print("第"+i+"次：");
        for(int j=0;j<n;j++){
            System.out.print(" "+a[j]);
        }
        System.out.println();
    }
}
