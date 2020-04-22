package com.thy.timer.robotdemo;

import java.text.SimpleDateFormat;
import java.util.TimerTask;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 14:35
 */
public class DacingRobot extends TimerTask {
    @Override
    public void run(){
        //获取最近的一次任务的执行时间，并将其格式化
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("计划执行时间为:"+sf.format(scheduledExecutionTime()));
        System.out.println("Dacing happy!");
    }
}
