package lz.zy.student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("${student.id}")
    private int id;//学号
    @Value("${student.name}")
    private String name; //名字
    @Value("${student.age}")
    private int age;//年龄

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}




