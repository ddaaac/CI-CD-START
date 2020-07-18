package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApplication {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        SpringApplication.run(DockerApplication.class, args);
    }

}
