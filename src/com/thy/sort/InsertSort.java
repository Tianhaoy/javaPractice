package com.thy.sort;

/**
 * @Description: TODO(直接插入排序算法)
 * @Author ASUS
 * @Date 2019/9/25 19:45
 * 把 n 个待排序的元素看成一个有序表和一个无序表，开始时有序表中只有一
 * 个元素，无序表中有 n-1 个元素；排序过程即每次从无序表中取出第一个元素，
 * 将它插入到有序表中，使之成为新的有序表，重复 n-1 次完成整个排序过程。
 */
public class InsertSort {
    public static void main(String[] args) {
        int [] a = {45,64,15,2,31,16,9,7};
        System.out.println("排序前：");
        for (int num:a){
            System.out.print(num+" ");
        }
        InsertSort InsertSort = new InsertSort();
        InsertSort.insertSort(a);
    }
    public void insertSort(int[] a){
        System.out.println();
        System.out.println("——————直接插入排序算法——————");
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
