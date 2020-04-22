package com.thy.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author ASUS
 * @Date 2019/10/13 17:09
 */
public class MyTimerTask extends TimerTask {
    private String name;
    private Integer count = 0;
    public  MyTimerTask(String inputName){
        name = inputName;
    }
    @Override
    public void run(){
        if (count<3){
        //以yyyy--MM--dd HH:mm:ss的格式打印当前执行时间
        //如2019/11/11 00：00：00
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy--MM--dd HH:mm:ss");
        System.out.println("Current exec time is" + sf.format(calendar.getTime()));
        //打印当前name的内容
        System.out.println("Current exec name is"+ name);
        count++;
        }else{
            cancel();
            System.out.println("Task Cancel!");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
