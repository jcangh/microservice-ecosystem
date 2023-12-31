package com.jca.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MeConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(MeConfigServer.class, args);
    }
}
