package com.ehgol.demo.repositories;


import com.ehgol.demo.entities.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador,Long> {
}
