package com.ehgol.demo.controllers;


import com.ehgol.demo.dto.JogoCreateDto;
import com.ehgol.demo.entities.Jogo;
import com.ehgol.demo.services.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity getAllJogos() {
        List<Jogo> jogos = jogoService.getAllJogos();
        return ResponseEntity.ok(jogos);
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveJogo(@RequestBody JogoCreateDto jogoCreateDto) {
        try {
            jogoService.saveJogoDto(jogoCreateDto);
            return ResponseEntity.ok("Partida cadastrada!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao salvar partida");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Jogo>> getById(@PathVariable Long id) {
        Optional<Jogo> jogo = jogoService.getJogoById(id);

        if (jogo != null) {
            return ResponseEntity.ok(jogo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("/atualizar{id}")
    public ResponseEntity<String> updateJogo(@PathVariable Long id, @RequestBody Jogo jogo) {
        try {
            jogoService.updateJogo(id, jogo);
            return ResponseEntity.ok("Booa, partida atualizada com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("ih rapaz, os dados da partida não foram atualizados!");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJogo(@PathVariable Long id) {
        jogoService.deleteJogo(id);
        return ResponseEntity.ok("Partida excluida com sucesso");
    }
}


