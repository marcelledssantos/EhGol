package com.ehgol.demo.controllers;

import com.ehgol.demo.entities.Jogador;
import com.ehgol.demo.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity listJogadores() {
        List<Jogador> jogadores = jogadorService.getAllJogadores();
        return  ResponseEntity.ok(jogadores);
    }

    @PostMapping("/save")
    public  ResponseEntity<String> saveJogador(@RequestBody Jogador jogador) {
        try {
            jogadorService.saveJogador(jogador);
        return  ResponseEntity.ok("Jogador cadastrado");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Erro ao salvar jogador");
        }
    }
}
