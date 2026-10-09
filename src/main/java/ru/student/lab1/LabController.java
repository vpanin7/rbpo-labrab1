package ru.student.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {

    @GetMapping("/reverse")
    public String reverse(@RequestParam String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @GetMapping("/square")
    public long square(@RequestParam int number) {
        return (long) number * number;
    }
}
