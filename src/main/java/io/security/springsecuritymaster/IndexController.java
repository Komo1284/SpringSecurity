package io.security.springsecuritymaster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/home")
    public String home() {
        return "Home";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "Login Page";
    }
}
