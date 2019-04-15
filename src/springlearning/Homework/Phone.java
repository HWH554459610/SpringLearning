package springlearning.Homework;

import org.springframework.stereotype.Controller;

@Controller("phone")
public class Phone {
    private String brand = "xiaomi";

    public void call() {
            System.out.println(brand + " phone call");
    }
}

