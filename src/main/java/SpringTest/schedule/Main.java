package SpringTest.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by gray- on 2017/7/26.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }
}
