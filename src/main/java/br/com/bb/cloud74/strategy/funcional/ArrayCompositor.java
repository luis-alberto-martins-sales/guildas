package br.com.bb.cloud74.strategy.funcional;

import java.util.function.Function;

public class ArrayCompositor implements Function<Integer,Function<Atributos,Integer>> {
    @Override
    public Function<Atributos,Integer> apply(Integer interval) {
        return atributos -> null;
    }
}
