package com.brundelmouro.javastudies.features.stream;

import com.brundelmouro.javastudies.features.stream.models.Pessoa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest01Methods {

    public static void main(String[] args) {

        //Listas
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final List<String> feira = List.of("banana", "maçã", "beterraba", "beringela", "couve", "cenoura");

        Set<Pessoa> pessoas = new HashSet<>();

        pessoas.add(new Pessoa(1, "Bruna", 1, Set.of("Java", "JUnit", "Spring Boot", "NoSQL")));
        pessoas.add(new Pessoa(1, "Alex", 3, Set.of("Java", "JUnit", "Spring Boot", "SQL", "Python", "GoLang", "Rest Assured")));
        pessoas.add(new Pessoa(1, "Maria", 5, Set.of("PHP", "Java", "SQL", "Python", "GoLang", "Ruby")));

        //teoria
        //stream apenas realiza operações, mas não guarda resultados
        //para guardar dados, utilizamos os Collectors

        //map method
        //retorna os componentes da lista baseando-se na transformação de dados ou afins
        List<Integer> result = numbers.stream()
                .map(number -> number * 2)
                .toList();
        result.forEach(System.out::println);

        System.out.println("------------------------------");

        //filter method
        //filtrar resultados por condições inseridas no método
        List<String> resultFeira = feira.stream()
                .filter(f -> f.startsWith("b"))
                .toList();
        resultFeira.forEach(System.out::println);

        System.out.println("------------------------------");

        //sorted method
        //ordernar objetos de uma lista
        //podemos usar também, o forEach juntamente ao stream
        feira.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------------------");

        //flatMap and distinct method
        //flatMap retorna a lista de tecnologias de cada pessoa em um único fluxo
        //distinct será capaz de eliminar repetições retornadas nas 3 listas totais
        pessoas.stream()
                .flatMap(pessoa -> pessoa.getTecnologias().stream())
                .distinct()
                .forEach(System.out::println);
    }
}

/*
references
https://medium.com/javarevisited/java-streams-for-beginners-105ed3aa2f74
https://www.youtube.com/watch?v=rkI7gkTkw4c
https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
*/
