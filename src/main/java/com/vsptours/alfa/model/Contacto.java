package com.vsptours.alfa.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "contacto")
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String mensaje;

    @Column(name = "fechaEnvio", nullable = false) // Mapea a la columna "fechaEnvio"
    private LocalDateTime fechaEnvio = LocalDateTime.now();
}
