package com.ehgol.demo.dto;

import jakarta.validation.constraints.NotBlank;


public class JogadorCreateDto {
    @NotBlank
    private String nome;
    private String idade;
    private String timeDoCoracao;
    @NotBlank
    private String email;
    @NotBlank
    private String senha;

    public JogadorCreateDto(String nome, String idade, String timeDoCoracao, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.timeDoCoracao = timeDoCoracao;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTimeDoCoracao() {
        return timeDoCoracao;
    }

    public void setTimeDoCoracao(String timeDoCoracao) {
        this.timeDoCoracao = timeDoCoracao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
