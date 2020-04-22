package com.thy.timer.robotdemo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/19 14:42
 */
public class Excutor {
    public static void main(String[] args) {
        Timer timer = new Timer();
        //获取当前时间
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间是: "+sf.format(calendar.getTime()));

        DacingRobot dr = new DacingRobot();
        WaterRobot wr = new WaterRobot(timer);

        timer.schedule(dr,calendar.getTime(),2000);
        timer.scheduleAtFixedRate(wr,calendar.getTime(),1000);

    }
}
