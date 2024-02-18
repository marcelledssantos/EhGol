package com.ehgol.demo.services;

import com.ehgol.demo.entities.Jogo;

import java.util.List;

public interface JogoService {

    List<Jogo> getAllJogos();

    Jogo getJogoById(Long id);

    Jogo saveJogo(Jogo jogo);

    Jogo updateJogo(Long id, Jogo jogoAtualizado);

    void deteleJogo(Long id);
}

