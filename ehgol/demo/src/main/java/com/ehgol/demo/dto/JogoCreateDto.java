package com.ehgol.demo.dto;

import com.ehgol.demo.entities.Jogador;

import java.time.LocalDate;

public class JogoCreateDto {
    private LocalDate data;
    private int golMarcado;
    private int golSofrido;
    private int mediaMensal;

    public JogoCreateDto() {}

    public JogoCreateDto(LocalDate data, int golMarcado, int golSofrido, int mediaMensal) {
        this.data = data;
        this.golMarcado = golMarcado;
        this.golSofrido = golSofrido;
        this.mediaMensal = mediaMensal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public String getHorario() {
        return null;
    }

    public Jogador getJogador() {
        return null;
    }
}
