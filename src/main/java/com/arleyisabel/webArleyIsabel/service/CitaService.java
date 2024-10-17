package com.arleyisabel.webArleyIsabel.service;

import com.arleyisabel.webArleyIsabel.model.Cita;
import com.arleyisabel.webArleyIsabel.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> obtenerCitas() {
        return citaRepository.findAll();
    }

    public Cita crearCita(Cita cita) {
        return citaRepository.save(cita);
    }
}
