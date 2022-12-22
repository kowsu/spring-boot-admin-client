package com.example.demo.jobs;

import com.example.demo.config.props.AdminParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GreetJob {

    @Autowired
    AdminParams adminParams;

    @Scheduled(cron = "*/5 * * * * ?")
    public void runJob() {
        System.out.println("Hello Scheduler...." + adminParams.getName() + " " + adminParams.getValue());
    }

}
