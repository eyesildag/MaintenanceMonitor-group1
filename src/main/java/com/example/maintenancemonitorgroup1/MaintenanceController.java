package com.example.maintenancemonitorgroup1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceController {
    private final String text = "Everything works as expected";
    private String value = text;


    @GetMapping("/api/message")
    public String message() {
        String code1 = "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "#grad1 {\n" +
                "  height: 100vh;\n" +
                "  padding-top: 40vh;\n" +
                "  width: 100%;\n" +
                "  text-align: center;\n";
        String code2 = "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"grad1\">" +
                "<h1>Maintenance Monitor</h1>\n" +
                "<p>"+value+"</p>\n" +
                "<p>last update: " + java.time.LocalTime.now() + "</p>\n" +
                "</div>" +
                "</body>\n" +
                "</html>";
        String ok = "  background-image: linear-gradient(to right, rgba(0,255,0,0), rgba(0,255,0,1));\n";
        String notOk = "  background-image: linear-gradient(to right, rgba(255,0,0,0), rgba(255,0,0,1));\n";

        if (value.equals(text)) {
            return code1+ok+code2;
        } else {
            return code1+notOk+code2;
        }
    }


    @GetMapping("/api/message/set")
    public String message(String m) {
        value = m;
        return "ok";
    }
}