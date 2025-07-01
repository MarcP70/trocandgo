package com.trocandgo.backend.controller;

import com.trocandgo.backend.model.Legume;
import com.trocandgo.backend.repository.LegumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/legumes")
@CrossOrigin(origins = "http://localhost:4200") // 👈 pour autoriser les appels depuis Angular
public class LegumeController {

    private final LegumeRepository legumeRepository;

    @Autowired
    public LegumeController(LegumeRepository legumeRepository) {
        this.legumeRepository = legumeRepository;
    }

    @GetMapping
    public List<Legume> getAll() {
        return legumeRepository.findAll();
    }
}
