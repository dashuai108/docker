package com.dashuai.pg.mavenpg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class MavenPgApplication {

    public static void main(String[] args) {
        SpringApplication.run(MavenPgApplication.class, args);
        System.out.println("Hello World!");
    }

}
