package demo.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@Controller
public class greetMessage {


    @GetMapping("greeting")
    public String greeting(final Map<? super String, Object> model) {
        model.put("message", "Hello Shreyas");
        return "greeting";
    }


}
