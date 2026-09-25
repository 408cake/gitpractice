package lksclass.gittest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingClass {
    @GetMapping("/hi")
    public String sayhi() {
        return "hi.html";
    }
}
