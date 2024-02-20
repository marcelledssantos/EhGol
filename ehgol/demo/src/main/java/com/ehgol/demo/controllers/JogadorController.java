package com.ehgol.demo.controllers;

import com.ehgol.demo.dto.JogadorCreateDto;
import com.ehgol.demo.dto.JogadorResponseDto;
import com.ehgol.demo.entities.Jogador;
import com.ehgol.demo.mapper.JogadorMapper;
import com.ehgol.demo.services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity getAllJogadores() {
        List<Jogador> jogadores = jogadorService.getAllJogadores();
        return ResponseEntity.ok(jogadores);
    }

    @PostMapping("/save")
    public ResponseEntity<JogadorResponseDto> create(@RequestBody JogadorCreateDto jogadorCreateDto) {
        Jogador jogador = JogadorMapper.toJogador(jogadorCreateDto);
        Jogador jogadorSalvo = jogadorService.saveJogadorDto(jogadorCreateDto);
        JogadorResponseDto jogadorResponseDto = JogadorMapper.toDto(jogadorSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(jogadorResponseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JogadorResponseDto> getById(@PathVariable Long id) {
        Jogador jogador = jogadorService.getJogadorById(id);

        return ResponseEntity.ok(JogadorMapper.toDto(jogador));

    }

    @PatchMapping("/atualizar/{id}")
    public ResponseEntity<String> updateJogador(@PathVariable Long id, @RequestBody Jogador jogador) {
        try {
            jogadorService.updateJogador(id, jogador);
            return ResponseEntity.ok("Booa, email e senha atualizados com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("ih rapaz, seus dados não foram atualizados!");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJogador(@PathVariable Long id) {
        jogadorService.deleteJogador(id);
        return ResponseEntity.ok("Jogador(a) excluido(a) com sucesso");
    }
}
