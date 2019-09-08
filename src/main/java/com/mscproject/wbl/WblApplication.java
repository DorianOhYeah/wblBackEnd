package com.mscproject.wbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//start the management
public class WblApplication {

    public static void main(String[] args) {
        SpringApplication.run(WblApplication.class, args);
    }

}
