package br.com.bb.cloud74.strategy.funcional;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class Repair implements BiConsumer<Atributos,Function<Atributos,Integer>> {
    @Override
    public void accept(Atributos atributos, Function<Atributos, Integer> funcao) {
        // prepara os arrays com os tamanhos deejados dos componentes
        // ...

        // determina onde estão as quebras
        funcao.apply(atributos);

        // dispõe os componentes de acordo com as quebras
        // ...
    }
}
