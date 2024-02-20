package com.ehgol.demo.services;

import com.ehgol.demo.dto.JogadorCreateDto;
import com.ehgol.demo.entities.Jogador;

import java.util.List;


public interface JogadorService {
    List<Jogador> getAllJogadores();

    Jogador getJogadorById(Long id);

    Jogador saveJogadorDto(JogadorCreateDto jogadorCreateDto);

    Jogador updateJogador(Long id, Jogador jogadorAtualizado);

    void deleteJogador(Long id);


}
