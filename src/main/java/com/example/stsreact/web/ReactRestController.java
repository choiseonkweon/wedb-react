package com.example.stsreact.web;

import com.example.stsreact.web.DTO.TestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/test")
public class ReactRestController {

    @GetMapping("/testMain")
    public String Nowij() {
        return "Spring Boot and React 연동 테스트 \n";
    }

    @PostMapping("/main")
    public String main(@RequestBody TestDTO testDTO) {
        return "Received: " + testDTO.getTest1() + ", " + testDTO.getTest2();
    }

    @GetMapping("/calendar")
    public String calender(@RequestParam String param) {
        return "Received: " + param;
    }
}
