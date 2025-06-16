package com.vsptours.alfa.service;

import com.vsptours.alfa.model.Usuario;
import com.vsptours.alfa.model.UsuarioDTO;
import com.vsptours.alfa.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RegistroService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public RegistroService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registrarUsuario(UsuarioDTO usuarioDTO) {
        // Verifica si el correo ya está registrado
        if (usuarioRepository.findByEmail(usuarioDTO.getEmail()).isPresent()) {
            throw new RuntimeException("El correo ya está registrado.");
        }        

        // Validar que la contraseña tenga al menos 8 caracteres (puedes agregar más
        // reglas)
        if (usuarioDTO.getContrasena().length() < 8) {
            throw new RuntimeException("La contraseña debe tener al menos 8 caracteres");
        }

        // Crear un nuevo usuario
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setTelefono(usuarioDTO.getTelefono());
        usuario.setFechaNacimiento(LocalDate.parse(usuarioDTO.getFechaNacimiento())); // Convertir String a LocalDate
        usuario.setContrasena(passwordEncoder.encode(usuarioDTO.getContrasena())); // Encriptar la contraseña

        // Guardar el usuario en la base de datos
        usuarioRepository.save(usuario);
    }
}
