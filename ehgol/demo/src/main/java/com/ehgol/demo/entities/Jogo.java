package com.ehgol.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "jogos")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "dataPartida", nullable = false)
    private LocalDate data;
    @Column(name = "horarioPartida", nullable = false)
    private LocalTime horario;
    @Column(name = "golsMarcados", nullable = false)
    private int golMarcado;
    @Column(name = "golsSofridos", nullable = false)
    private int golSofrido;

    @Column(name = "mediaMensal")
    private int mediaMensal;

    @ManyToOne
    @JoinColumn(name = "id_jogador", nullable = false)
    private Jogador jogador;

    public Jogo() {
    }

    public Jogo(Long id, LocalDate data, LocalTime horario, int golMarcado, int golSofrido, int mediaMensal, Jogador jogador) {
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.golMarcado = golMarcado;
        this.golSofrido = golSofrido;
        this.mediaMensal = mediaMensal;
        this.jogador = jogador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
       this.horario = horario;
    }

    public int getGolMarcado() {
        return golMarcado;
    }

    public void setGolMarcado(int golMarcado) {
        this.golMarcado = golMarcado;
    }

    public int getGolSofrido() {
        return golSofrido;
    }

    public void setGolSofrido(int golSofrido) {
        this.golSofrido = golSofrido;
    }

    public int getMediaMensal() {
        return mediaMensal;
    }

    public void setMediaMensal(int mediaMensal) {
        this.mediaMensal = mediaMensal;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

}
