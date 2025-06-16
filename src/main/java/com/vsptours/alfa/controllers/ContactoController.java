package com.vsptours.alfa.controllers;

import com.vsptours.alfa.model.Contacto;
import com.vsptours.alfa.service.ContactoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {

    private final ContactoService contactoService;

    public ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("pageTitle", "Contacto - VSP Tours"); // Añade el título de la página
        model.addAttribute("contacto", new Contacto()); // Añade el objeto contacto para el formulario
        return "contacto";
    }

    @PostMapping
    public String procesarFormulario(Contacto contacto, Model model) {
        contactoService.guardarMensaje(contacto);
        model.addAttribute("mensaje", "¡Gracias por contactarnos! Tu mensaje ha sido enviado.");
        model.addAttribute("pageTitle", "Contacto - VSP Tours"); // Añade el título de la página
        return "contacto";
    }
}
