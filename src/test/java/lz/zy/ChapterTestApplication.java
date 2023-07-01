package lz.zy;


import lz.zy.example.ChapterController;
import lz.zy.student.Person;
import lz.zy.student.Student;
import lz.zy.student.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ChapterTestApplication {
    String TAG = "ChapterTestApplication";
    @Autowired //注入ChapterController类
    private ChapterController chapterController;

    @Autowired //注入Student类
    private Student student;

    @Autowired
    private User user;

    @Value("${student.id}")
    private int id;//学号
    @Value("${student.name}")
    private String name; //名字
    @Value("${student.age}")
    private int age;//年龄
    @Autowired
    private Person person;
    @Test
    public void contextLoads() {
        System.out.println("单元测试返回的数据" + student);
        System.out.println("单元测试返回的数据" + user);
        System.out.println("单元测试的返回数据" + person);
    }
}






