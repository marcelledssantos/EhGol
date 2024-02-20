package com.ehgol.demo.services;

import com.ehgol.demo.dto.JogoCreateDto;
import com.ehgol.demo.entities.Jogo;

import java.util.List;
import java.util.Optional;

public interface JogoService {

    List<Jogo> getAllJogos();

    Optional<Jogo> getJogoById(Long id);

    Jogo saveJogoDto(JogoCreateDto jogoCreateDto);

    Jogo updateJogo(Long id, Jogo jogoAtualizado);

    void deleteJogo(Long id);
}

