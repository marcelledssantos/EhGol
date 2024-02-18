package com.ehgol.demo.services;

import com.ehgol.demo.entities.Jogador;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JogadorService {
    List<Jogador> getAllJogadores();

    Jogador getJogadorById(Long id);

    Jogador saveJogador(Jogador jogador);

    Jogador updateJogador(Long id, Jogador jogadorAtualizado);

    void deleteJogador(Long id);


}
