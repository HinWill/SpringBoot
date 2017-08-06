package SpringTest.schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by gray- on 2017/7/26.
 */
@Configuration
@ComponentScan("SpringTest.schedule")
@EnableScheduling       //开启对计划任务的支持
public class ScheduledConfig {

}
