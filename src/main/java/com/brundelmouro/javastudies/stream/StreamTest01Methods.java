package com.brundelmouro.javastudies.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamTest01Methods {

    public static void main(String[] args) {

        //Listas
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final List<String> feira = List.of("banana", "maçã", "beterraba", "beringela", "couve", "cenoura");

        //TODO teoria
        //stream apenas realiza operações, mas não guarda resultados
        //para guardar dados, utilizamos os Collectors

        //TODO map method
        //retorna os componentes da lista baseando-se na transformação de dados ou afins
        List<Integer> result = numbers.stream()
                .map(number -> number * 2)
                .toList();
        result.forEach(System.out::println);

        System.out.println("------------------------------");

        //TODO filter method
        //filtrar resultados por condições inseridas no método
        List<String> resultFeira = feira.stream()
                .filter(f -> f.startsWith("b"))
                .toList();
        resultFeira.forEach(System.out::println);

        System.out.println("------------------------------");

        //TODO sorted method
        //ordernar objetos de uma lista
        //TODO podemos usar também, o forEach juntamente ao stream
        feira.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

/*
references
https://medium.com/javarevisited/java-streams-for-beginners-105ed3aa2f74
https://www.youtube.com/watch?v=rkI7gkTkw4c
https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
*/
