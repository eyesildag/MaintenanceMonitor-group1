package com.example.maintenancemonitorgroup1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {

    private final String text = "Everything works as expected";


    @GetMapping("/api/message")
    public String message() {
        return text;
    }
}

