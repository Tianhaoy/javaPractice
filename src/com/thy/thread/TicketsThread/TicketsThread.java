package com.thy.thread.TicketsThread;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/9 21:41
 */
class MyThread extends Thread{
    private int ticketsCont = 5;//一共5张火车票
    private String name;        //窗口，也是线程的名字

    public MyThread(String name){
        this.name=name;
    }

    @Override
    public void run() {
      while (ticketsCont>0){
          ticketsCont--;    //如果还有票，就卖掉一张
          System.out.println(name+"卖了一张票，剩余票数为"+ticketsCont);
      }
    }
}

public class TicketsThread {
    public static void main(String[] args) {
        //创建三个线程，模拟三个窗口卖票
        MyThread mt1 =new MyThread("窗口1");
        MyThread mt2 =new MyThread("窗口2");
        MyThread mt3 =new MyThread("窗口3");

        //启动这三个线程
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
