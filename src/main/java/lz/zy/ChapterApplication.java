package lz.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
public class ChapterApplication {
    public static void main(String[] args) {

        SpringApplication.run(ChapterApplication.class, args);
        System.out.println("第一个 Spring Boot 项目");
    }


}