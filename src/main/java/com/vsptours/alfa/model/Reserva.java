package com.vsptours.alfa.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreCliente;

    @Column(nullable = false)
    private String destino;

    @Column(nullable = false)
    private String tipoMovilidad;

    @Column(nullable = false)
    private String tipoServicio;

    @Column(nullable = false)
    private String ubicacionRecojo;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
