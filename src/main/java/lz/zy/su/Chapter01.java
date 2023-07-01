package lz.zy.su;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration//指定当前的类
@PropertySource("classpath:custom.properties")
@EnableConfigurationProperties(Chapter01.class)
@ConfigurationProperties(prefix = "su")

public class Chapter01 {

}
