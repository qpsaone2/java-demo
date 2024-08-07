package com.example.demo;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController {
    @GetMapping("/")
    public String test() {
        return "tkg-tk-gscm-was";
    }
    @GetMapping("/test")
    public String test1() {
        return "sangcheol";
    }
}
