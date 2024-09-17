package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Returns the login HTML page
    }

    @GetMapping("/profile")
    public String userProfile() {
        return "user"; // Returns the user profile page (teacher/student)
    }
}
