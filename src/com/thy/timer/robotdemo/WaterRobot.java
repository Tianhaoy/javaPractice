package com.thy.timer.robotdemo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 14:39
 */
public class WaterRobot extends TimerTask {
    private Timer timer;
    //最大容量为5L
    private Integer buckerCount = 0;
    public WaterRobot(Timer inputTimer){
        timer = inputTimer;
    }
    @Override
    public void run(){
        //灌水直至水满为止
        if (buckerCount<5){
            System.out.println("All 1L Water into the bucket!");
            buckerCount ++;
        }else{
            //水满之后停止执行
            System.out.println("计时器中已取消的任务数 "+timer.purge());
            cancel();
            System.out.println("灌水机器结束了");
            System.out.println("计时器中已取消的任务数 "+timer.purge());
            System.out.println("Current water is "+ buckerCount+"L");
            //等待两秒中，终止Timer里面的所有内容
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer.cancel();
        }


    }
}
