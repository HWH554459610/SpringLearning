package springlearning.Homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        // 指定Spring配置文件路径

        String xmlPath= "springlearning/Homework/bean.xml";
        // 创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        // 从容器中获取bean
        Student bean1 = (Student) ac.getBean("student");
        // 使用bean
        System.out.println(bean1.toString());
    }
}
