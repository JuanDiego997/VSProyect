package com.vsptours.alfa.service;

import com.vsptours.alfa.model.Contacto;
import com.vsptours.alfa.repository.ContactoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {

    private final ContactoRepository contactoRepository;

    public ContactoService(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    public Contacto guardarMensaje(Contacto contacto) {
        return contactoRepository.save(contacto);
    }
}
