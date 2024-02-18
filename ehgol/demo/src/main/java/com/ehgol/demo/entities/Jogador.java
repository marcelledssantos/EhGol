package com.ehgol.demo.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "jogadores")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String nome;
    private String idade;
    private String timeDoCoracao;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "senha", nullable = false)
    private String senha;

    @OneToMany (mappedBy = "jogador")
    private Set<Jogo>  jogos;

    public Jogador() {
    }

    public Jogador(Long id, String nome, String idade, String timeDoCoracao, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.timeDoCoracao = timeDoCoracao;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
