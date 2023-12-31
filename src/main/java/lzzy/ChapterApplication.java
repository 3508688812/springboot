package lzzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author IDEA
 * @Date 2023/9/6
 */
@SpringBootApplication //用注解标识的类作为SpringBoot的入口类（启动类）
//加载自定义xml配置文件配置
public class ChapterApplication {
    public static void main(String[] args) {

        SpringApplication.run(ChapterApplication.class, args);
        System.out.println("这是一个 Spring Boot 项目");

    }
}
