package springlearning.Homework;

import org.springframework.stereotype.Controller;

@Controller("student")
public class Student {
    private Phone phone;

    public void setPhone(Phone phone) {
            this.phone = phone;
        }
}
