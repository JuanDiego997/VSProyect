package com.vsptours.alfa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/flota")
    public String flota() {
        return "flota";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
    @GetMapping("/sobrenostros")
    public String sobrenostros() {
        return "sobrenostros";
    }

    @GetMapping("/contraseñaolvidada")
    public String contraseñaolvidada() {
        return "contraseñaolvidada";
    }

    @GetMapping("/destinos")
    public String destinos() {
        return "destinos";
    }
     @GetMapping("/login")
    public String login() {
        return "login";
    }

     @GetMapping("/registro")
    public String registro() {
        return "registro";
    }
 @GetMapping("/enviarreserva")
    public String enviarreserva() {
        return "enviarreserva";
    }

     @GetMapping("/pozuzo")
    public String pozuzo() {
        return "pozuzo";
    }
 @GetMapping("/pucallpa")
    public String pucallpa() {
        return "pucallpa";
    }

     @GetMapping("/servicios")
    public String servicios() {
        return "servicios";
    }
}