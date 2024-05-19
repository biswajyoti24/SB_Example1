package com.example.java_program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EntityScan("com.example.java_program.model")
public class SbExample1Application extends com.example.java_program.ServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SbExample1Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SbExample1Application.class);
    }

}
