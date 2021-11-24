package com.magicdu.questionpaper;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan({"com.magicdu.questionpaper.**.mapper"})

public class QuestionpaperApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionpaperApplication.class, args);
    }

}
