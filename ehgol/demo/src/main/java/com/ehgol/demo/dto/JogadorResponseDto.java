package com.ehgol.demo.dto;


public class JogadorResponseDto {
    private String nome;
    private String idade;
    private String timeDoCoracao;
    private String email;

    public JogadorResponseDto() {}

    public JogadorResponseDto(String nome, String idade, String timeDoCoracao, String email) {
        this.nome = nome;
        this.idade = idade;
        this.timeDoCoracao = timeDoCoracao;
        this.email = email;
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
}
