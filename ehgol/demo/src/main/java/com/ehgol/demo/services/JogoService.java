package com.ehgol.demo.services;

import com.ehgol.demo.entities.Jogo;

import java.util.List;
import java.util.Optional;

public interface JogoService {

    List<Jogo> getAllJogos();

    Optional<Jogo> getJogoById(Long id);

    Jogo saveJogo(Jogo jogo);

    Jogo updateJogo(Long id, Jogo jogoAtualizado);

    void deleteJogo(Long id);
}

