package com.thy.thread.threadTest;

import java.util.Random;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/12 22:32
 */
class MyThread implements Runnable {
    private int num = 1;
    private int[] arr = {5, 10, 20, 30, 40, 100, 200, 300, 500, 600, 1000};
    private boolean keepRunning = true;
    Random random = new Random();



    @Override
    public void run() {
        while (keepRunning) {
            if (num<20){
                int i = (int) (Math.random() * arr.length);
                int money =arr[i];
                System.out.println(Thread.currentThread().getName() + "又抽中了" +money+ "元大奖！");
                num++;
            }else{
                System.out.println(Thread.currentThread().getName() +"抽奖结束！");
                keepRunning = false;
            }

        }
    }

}

public class Test1 {
    public static void main(String[] args) {
        MyThread test = new MyThread();
        Thread s1 =new Thread(test,"抽奖池1");
        Thread s2 = new Thread(test,"抽奖池2");

        s1.start();;
        s2.start();
    }

}
