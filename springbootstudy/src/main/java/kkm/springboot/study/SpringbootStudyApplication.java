package kkm.springboot.study;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.awt.*;

@SpringBootApplication
@Slf4j
@EnableScheduling
public class SpringbootStudyApplication {


    public static void main(String[] args) {

        SpringApplication.run(SpringbootStudyApplication.class,args);
        log.info("1111111111");
    }
}
