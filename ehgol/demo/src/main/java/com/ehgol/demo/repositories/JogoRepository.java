package com.ehgol.demo.repositories;

import com.ehgol.demo.entities.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}
