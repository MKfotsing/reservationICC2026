package be.iccbxl.pid.reservations_springboot.controller;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/** Quand @PreAuthorize refuse l'accès : retour à l'accueil avec une notification. */
@ControllerAdvice
public class AccessDeniedAdvice {

    @ExceptionHandler(AccessDeniedException.class)
    public String handleAccessDenied(RedirectAttributes redirAttrs) {
        redirAttrs.addFlashAttribute("errorMessage", "Vous n'avez pas le droit d'effectuer cette action.");
        return "redirect:/";
    }
}
