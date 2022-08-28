package com.brundelmouro.javastudies.lambda;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01Consumer {

    public static void main(String[] args) {
        final List<String> strings = List.of("Bruna", "Vitória", "Maria", "Spike");
        final List<Integer> integers = List.of(0, 1, 2, 3, 4);

        //Esse tipo de lamba(consumer) retorna um void
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));

        //outro tipo para percorrer uma lista
        strings.forEach(s -> System.out.println(s));
        strings.forEach(System.out::println);
    }

    //sem retorno
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e : list) {
            consumer.accept(e);
        }
    }
}

/*
* references
* https://www.youtube.com/watch?v=tqMkX-jZczw&t=1s
* */
