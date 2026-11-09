package be.iccbxl.pid.reservations_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // Accès réservé au rôle ADMIN par SpringSecurityConfig
    @GetMapping("/admin")
    public String index() {
        return "admin/index";
    }
}
