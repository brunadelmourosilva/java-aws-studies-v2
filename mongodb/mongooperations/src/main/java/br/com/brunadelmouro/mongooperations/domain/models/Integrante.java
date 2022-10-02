package br.com.brunadelmouro.mongooperations.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Integrante")
public class Integrante {

    @Id
    private String id;
    private String nome;
    private Integer idade;

    public Integrante() {
        //default constructor
    }

    public Integrante(final String nome, final Integer idade) {
        this.nome = nome;
        this.idade = idade;
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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(final Integer idade) {
        this.idade = idade;
    }
}
