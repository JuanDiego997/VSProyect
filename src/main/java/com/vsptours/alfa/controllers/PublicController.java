package com.vsptours.alfa.controllers;

// Required imports
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PublicController {
    
    @GetMapping({"", "/", "/inicio"})
    public String inicio(Model model) {
        model.addAttribute("pageTitle", "Inicio - VSP Tours");
        return "inicio";  // Requires templates/inicio.html
    }
    
    @GetMapping("/servicios")
    public String servicios(Model model) {
        model.addAttribute("pageTitle", "Servicios - VSP Tours");
        return "servicios"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/flota")
    public String flota(Model model) {
        model.addAttribute("pageTitle", "Flota - VSP Tours");
        return "flota"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/destinos")
    public String destinos(Model model) {
        model.addAttribute("pageTitle", "Destinos - VSP Tours");
        return "destinos"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("pageTitle", "Contacto - VSP Tours");
        return "contacto"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/nosotros")
    public String nosotros(Model model) {
        model.addAttribute("pageTitle", "Nosotros - VSP Tours");
        return "nosotros"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/reservar")
    public String reservar(Model model) {
        model.addAttribute("pageTitle", "Reservar - VSP Tours");
        return "reservar"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/authlogin")
    public String authlogin (Model model) {
        model.addAttribute("pageTitle", "Login - VSP Tours");
        return "authlogin"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/registro")
    public String registro(Model model) {
        model.addAttribute("pageTitle", "Resgistro - VSP Tours");
        return "registro"; // Debe coincidir con el nombre del archivo HTML
    }
    @GetMapping("/olvidado")
    public String olvidado(Model model) {
        model.addAttribute("pageTitle", "Olvidado - VSP Tours");
        return "olvidado"; // Debe coincidir con el nombre del archivo HTML
    }
}
 