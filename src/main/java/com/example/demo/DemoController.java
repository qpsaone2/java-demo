package com.example.demo;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController {
    @GetMapping("/test")
    public String test() {
        return "test demo333";
    }
}
