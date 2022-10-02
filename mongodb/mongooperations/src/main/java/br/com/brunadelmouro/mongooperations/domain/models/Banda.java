package br.com.brunadelmouro.mongooperations.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "Banda")
public class Banda {

    @Id
    private String id;
    private String nome;
    private String genero;
    private Integer anoCriacao;
    private Set<Integrante> integrantes;

    public Banda() {
        //default constructor
    }

    public Banda(final String nome, final String genero, final Integer anoCriacao) {
        this.genero = genero;
        this.nome = nome;
        this.anoCriacao = anoCriacao;
    }

    public Banda(final String nome, final String genero, final Integer anoCriacao, final Set<Integrante> integrantes) {
        this.genero = genero;
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.integrantes = integrantes;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(final String genero) {
        this.genero = genero;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(final Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public Set<Integrante> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(final Set<Integrante> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Banda{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", integrantes=" + integrantes +
                '}';
    }
}
