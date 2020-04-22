package com.thy.thread.TicketsThread;

/**
 * @Description: TODO(synchronized实现同步与互斥)
 * @Author ASUS
 * @Date 2019/10/10 20:27
 */
class MyThread2 implements Runnable{
    private int ticketsCont = 10;//一共5张火车票
    private final Object lockObj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (lockObj){
                while (ticketsCont<=0){
                  System.out.println(Thread.currentThread().getName()+"没票了");
                    try {
                        lockObj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ticketsCont--;    //如果还有票，就卖掉一张
                System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数为"+ticketsCont);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lockObj.notifyAll();

            }
        }


    }
}

public class TicketsRunnable {
    public static void main(String[] args) {

        MyThread2 mt =new MyThread2();
        //创建三个线程，模拟三个窗口卖票
        Thread th1 = new Thread(mt,"窗口1");
        Thread th2 = new Thread(mt,"窗口2");
        Thread th3 = new Thread(mt,"窗口3");
        //启动这三个线程
        th1.start();
        th2.start();
        th3.start();

    }
}
