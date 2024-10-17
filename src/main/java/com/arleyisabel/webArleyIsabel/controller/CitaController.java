package com.arleyisabel.webArleyIsabel.controller;

import com.arleyisabel.webArleyIsabel.model.Cita;
import com.arleyisabel.webArleyIsabel.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Cita> obtenerCitas() {
        return citaService.obtenerCitas();
    }

    @PostMapping
    public Cita crearCita(@RequestBody Cita cita) {
        return citaService.crearCita(cita);
    }
}
