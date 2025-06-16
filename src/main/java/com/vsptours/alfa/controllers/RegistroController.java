package com.vsptours.alfa.controllers;

import com.vsptours.alfa.model.UsuarioDTO;
import com.vsptours.alfa.service.RegistroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    private final RegistroService registroService;

    public RegistroController(RegistroService registroService) {
        this.registroService = registroService;
    }

    @GetMapping
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("pageTitle", "Registro - VSP Tours");
        if (!model.containsAttribute("usuarioDTO")) {
            model.addAttribute("usuarioDTO", new UsuarioDTO());
        }
        return "registro";
    }

    @PostMapping
    public String registrarUsuario(UsuarioDTO usuarioDTO, 
                                 RedirectAttributes redirectAttributes) {
        try {
            registroService.registrarUsuario(usuarioDTO);
            redirectAttributes.addFlashAttribute("success", "¡Registro exitoso! Ahora puedes iniciar sesión.");
            return "redirect:/authlogin";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error: " + e.getMessage());
            redirectAttributes.addFlashAttribute("usuarioDTO", usuarioDTO);
            return "redirect:/registro";
        }
    }
}
