package com.ehgol.demo.servicesImpl;

import com.ehgol.demo.entities.Jogo;
import com.ehgol.demo.repositories.JogoRepository;
import com.ehgol.demo.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public Jogo saveJogo(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

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
    public void deleteJogo(Long id) {jogoRepository.deleteById(id);}
}
