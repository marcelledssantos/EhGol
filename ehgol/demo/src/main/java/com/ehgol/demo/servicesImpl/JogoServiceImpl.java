package com.ehgol.demo.servicesImpl;

import com.ehgol.demo.dto.JogoCreateDto;
import com.ehgol.demo.entities.Jogador;
import com.ehgol.demo.entities.Jogo;
import com.ehgol.demo.mapper.JogadorMapper;
import com.ehgol.demo.mapper.JogoMapper;
import com.ehgol.demo.repositories.JogoRepository;
import com.ehgol.demo.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class JogoServiceImpl implements JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    @Override
    public List<Jogo> getAllJogos() {
        return jogoRepository.findAll();
    }
    @Override
    public Optional<Jogo> getJogoById(Long id) {
        return jogoRepository.findById(id);
    }
//Corrigir Bug//
  /* public Jogo saveJogoDto(JogoCreateDto jogoCreateDto) {
        Jogo jogo = JogoMapper.toJogo(jogoCreateDto);
        if (jogoCreateDto.getHorario() == null) {
            throw new IllegalArgumentException("O horário em JogoCreateDto não pode ser nulo");
        }
        jogo.setHorario(ajustaHorario(jogoCreateDto.getHorario()));
        return jogoRepository.save(jogo);
    }

    private LocalTime ajustaHorario(String horario) {
        return LocalTime.parse(horario);
    }*/

    @Override
    public Jogo updateJogo(Long id, Jogo jogoAtt) {
        Jogo jogoExistente = jogoRepository.findById(id).orElse(null);
        if (jogoExistente != null) {
            jogoExistente.setData(jogoAtt.getData());
            jogoExistente.setHorario(jogoAtt.getHorario());
            jogoExistente.setGolSofrido(jogoAtt.getGolSofrido());
            jogoExistente.setGolMarcado(jogoAtt.getGolMarcado());
            return jogoRepository.save(jogoExistente);
        } else {
            throw new RuntimeException("Partida com Id " + id + " não encontrada");
        }
    }

    @Override
    public void deleteJogo(Long id) {
        jogoRepository.deleteById(id);
    }
}
