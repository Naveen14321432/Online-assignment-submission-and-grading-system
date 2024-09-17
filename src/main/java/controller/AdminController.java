package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminPage() {
        return "admin"; // Returns the admin HTML page
    }

    // Add other admin-related endpoints (e.g., manage users, view submissions)
}
