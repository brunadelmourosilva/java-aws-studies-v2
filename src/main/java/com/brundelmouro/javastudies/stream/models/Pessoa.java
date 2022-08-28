package com.brundelmouro.javastudies.stream.models;

import java.util.Set;

public class Pessoa {

    private Integer id;
    private String nome;
    private Integer experienciaProgramacao;
    private Set<String> tecnologias;

    public Pessoa() {
        //default constructor
    }

    public Pessoa(final Integer id, final String nome, final Integer experienciaProgramacao, final Set<String> tecnologias) {
        this.id = id;
        this.nome = nome;
        this.experienciaProgramacao = experienciaProgramacao;
        this.tecnologias = tecnologias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Integer getExperienciaProgramacao() {
        return experienciaProgramacao;
    }

    public void setExperienciaProgramacao(final Integer experienciaProgramacao) {
        this.experienciaProgramacao = experienciaProgramacao;
    }

    public Set<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(final Set<String> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
