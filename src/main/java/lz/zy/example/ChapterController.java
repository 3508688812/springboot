package lz.zy.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制类
 */
@RestController
public class ChapterController {
    @RequestMapping(value = "/hello")

    public String sayHello() {
        return "hello SpringBoot ";

    }
}
