package SpringTest.schedule;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gray- on 2017/7/26.
 */

@Service
public class Scheduled {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    //计划任务
    @org.springframework.scheduling.annotation.Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次"+dateFormat.format(new Date()));
    }


    //指定时间执行
    @org.springframework.scheduling.annotation.Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间"+dateFormat.format(new Date())+"执行");
    }

}
