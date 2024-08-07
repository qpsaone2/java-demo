package com.example.demo;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController {
    @GetMapping("/")
    public String test() {
        return "testsdasdjhdsga";
    }
    @GetMapping("/test")
    public String test1() {
        return "test demo333";
    }
}
