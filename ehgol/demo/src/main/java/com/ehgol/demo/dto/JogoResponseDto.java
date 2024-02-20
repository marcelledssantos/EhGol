package com.ehgol.demo.dto;

import java.time.LocalDate;

public class JogoResponseDto {
    private LocalDate data;
    private int golMarcado;
    private int golSofrido;
    private int mediaMensal;

    public JogoResponseDto() {}
    public JogoResponseDto(LocalDate data, int golMarcado, int golSofrido, int mediaMensal) {
        this.data = data;
        this.golMarcado = golMarcado;
        this.golSofrido = golSofrido;
        this.mediaMensal = mediaMensal;
    }
}
