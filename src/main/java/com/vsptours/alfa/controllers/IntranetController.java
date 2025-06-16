package com.vsptours.alfa.controllers;

import com.vsptours.alfa.model.Usuario;
import com.vsptours.alfa.repository.UsuarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/intranet")
public class IntranetController {

    private final UsuarioRepository usuarioRepository;

    public IntranetController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public String intranet(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("pageTitle", "Intranet - VSP Tours");
        return "intranet";
    }
}
