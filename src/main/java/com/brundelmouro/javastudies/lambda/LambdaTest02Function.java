package com.brundelmouro.javastudies.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02Function {

    public static void main(String[] args) {
        final List<String> strings = List.of("Bruna", "Delmouro");

        //esse tipo de lamba(Function) tem retorno
        List<String> map = map(strings, s -> s.toUpperCase());
        System.out.println(map);
    }

    //com retorno
    private static <T, R>List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();

        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }

        return result;
    }

}
