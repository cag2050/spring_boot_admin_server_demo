package com.cag2050.spring_boot_admin_server_demo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminServerDemoApplication.class, args);
    }

}
