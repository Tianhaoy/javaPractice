package com.thy.thread.base;

/**
 * @Description: TODO(隋唐演义大戏舞台)
 * @Author ASUS
 * @Date 2019/10/8 21:28
 */
public class Stage extends Thread {
    public void run(){
        System.out.println("欢迎观看隋唐演义！");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("大幕徐徐拉开");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("话说隋朝末年，隋军与农民起义军杀的昏天暗地。。。");

        ArmyRunnable armyTaskOfSuiDynastry = new ArmyRunnable();
        ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
        //使用Runnable接口创建线程
        Thread armyOfSuiDynastry = new Thread(armyTaskOfSuiDynastry,"隋军");
        Thread armyOfRevolt =new Thread(armyTaskOfRevolt,"农民起义军");
        //启动线程，让军队开始作战
        armyOfSuiDynastry.start();
        armyOfRevolt.start();

        //舞台线程休眠，大家专心观看军队厮杀
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("正当双方激战正酣，半路杀出了个程咬金");

        Thread mrCheng = new KeyPersonThread();
        mrCheng.setName("程咬金");

        System.out.println("程咬金的理想就是结束战斗，使百姓安居乐业！");
        //停止军队作战
        //停止线程的方法
        armyTaskOfSuiDynastry.keepRunning=false;
        armyTaskOfRevolt.keepRunning=false;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //历史大戏留给关键人物
        mrCheng.start();

        //万众瞩目，所有线程等待程先生完成历史使命
        try {
            mrCheng.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("战争结束，人民安居乐业！");
        System.out.println("谢谢观看，再见！");
        /*try {
            armyOfRevolt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }

    public static void main(String[] args) {
        new Stage().run();
    }
}
