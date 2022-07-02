package com.example.demo.spring.scheduler.task;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Log4j2
@Component
public class Task {

    @Scheduled(fixedRate = 5000)
    public void logCurrentDate(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        log.info("La hora actual es: {}", simpleDateFormat.format(new Date()));
    }

}
