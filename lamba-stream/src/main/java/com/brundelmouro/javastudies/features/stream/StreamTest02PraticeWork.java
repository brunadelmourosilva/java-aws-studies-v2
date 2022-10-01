package com.brundelmouro.javastudies.features.stream;

import com.brundelmouro.javastudies.features.stream.models.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class StreamTest02PraticeWork {

    public static void main(String[] args) throws ClassNotFoundException {

        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa(1, "Bruna", 1, Set.of("Java", "JUnit", "Spring Boot", "NoSQL")));
        pessoas.add(new Pessoa(1, "Alex", 3, Set.of("Java", "JUnit", "Spring Boot", "SQL", "Python", "GoLang", "Rest Assured")));
        pessoas.add(new Pessoa(1, "Maria", 5, Set.of("PHP", "Java", "SQL", "Python", "GoLang", "Ruby")));

        // TODO filtrar uma lista de pessoas e encontrar a classe de acordo com:
        // onde uma única pessoa tenha 1 ano de experiência e por fim, retornar a lista
        // de tecnologias dessa pessoa
        final var pessoa =
                pessoas.stream()
                        .filter(p -> p.getExperienciaProgramacao().equals(1))
                        .findFirst() //encontrar a primeira e única ocorrencia de pessoa
                        .orElseThrow(ClassNotFoundException::new);

        System.out.println("*** " + pessoa.getNome() + " ***");
        pessoa.getTecnologias().forEach(System.out::println);
    }
}

/*
* references
* https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html
* https://www.oracle.com/br/technical-resources/articles/java-stream-api.html*/
