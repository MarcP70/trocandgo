package com.trocandgo.backend.repository;

import com.trocandgo.backend.model.Legume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LegumeRepository extends JpaRepository<Legume, Long> {
}
