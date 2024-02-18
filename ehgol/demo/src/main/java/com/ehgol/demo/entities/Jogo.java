package com.ehgol.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "jogos")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "dataPartida", nullable = false)
    private LocalDateTime data;
    @Column(name = "horarioPartida", nullable = false)
    private LocalDateTime horario;
    @Column(name = "golsMarcados", nullable = false)
    private int golMarcado;
    @Column(name = "golsSofridos", nullable = false)
    private int golSofrido;

    @Column(name = "mediaMensal")
    private int mediaMensal;

    @ManyToOne
    @JoinColumn(name = "id_jogador", nullable = false)
    private Jogador jogador;

    public Jogo() {}

    public Jogo(Long id, LocalDateTime data, LocalDateTime horario, int golMarcado, int golSofrido, int mediaMensal) {
        this.id = id;
        this.data = data;
        this.horario = horario;
        this.golMarcado = golMarcado;
        this.golSofrido = golSofrido;
        this.mediaMensal = mediaMensal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
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
