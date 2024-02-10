package com.nfyc.studyrevisionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NfycStudyRevisionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NfycStudyRevisionServiceApplication.class, args);
    }

}
