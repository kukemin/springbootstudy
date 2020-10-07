package kkm.springboot.study.schedule;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
public class kkmSchedule {


    private  static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");


    @Scheduled(fixedRate = 3000)
    public void schedule1(){

        log.info("current time:{}", LocalDateTime.now().format(fmt));

    }

}
