package com.ehgol.demo.servicesImpl;

import com.ehgol.demo.entities.Jogador;
import com.ehgol.demo.repositories.JogadorRepository;
import com.ehgol.demo.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JogadorServiceImpl implements JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Override
    public List<Jogador> getAllJogadores() {
        return jogadorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Jogador getJogadorById(Long id) {
        return jogadorRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Jogador saveJogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    @Override
    public Jogador updateJogador(Long id, Jogador jogadorAtt) {
        Jogador jogadorExistente = jogadorRepository.findById(id).orElse(null);
        if (jogadorExistente != null) {
            jogadorExistente.setEmail(jogadorAtt.getEmail());
            jogadorExistente.setSenha(jogadorAtt.getSenha());
            return jogadorRepository.save(jogadorExistente);
        } else {
            throw new RuntimeException("Jogador com Id " + id + " não encontrado");
        }
    }

    @Override
    public void deleteJogador(Long id) {
        jogadorRepository.deleteById(id);
    }
}
