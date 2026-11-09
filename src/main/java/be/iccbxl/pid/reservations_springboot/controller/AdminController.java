package be.iccbxl.pid.reservations_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // Point d'entrée du back-office : Spring Security impose la connexion avant d'arriver ici
    @GetMapping("/admin/login")
    public String login() {
        return "redirect:/admin";
    }

    // Accès réservé au rôle ADMIN par SpringSecurityConfig
    @GetMapping("/admin")
    public String index() {
        return "admin/index";
    }
}
