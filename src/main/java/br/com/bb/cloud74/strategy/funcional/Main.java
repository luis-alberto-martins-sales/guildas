package br.com.bb.cloud74.strategy.funcional;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        /*GAMMA, Erich; HELM, Richard; JOHNSON, Ralph; et al.
        Padrões de projetos: soluções reutilizáveis de software orientados a objetos.
        Grupo A, 2000. E-book. 9788577800469, p. 297-299.
        Disponível em: https://unibb.minhabiblioteca.com.br/#/books/9788577800469/.
        Acesso em: 18 ago. 2022.*/
        Atributos atributos = new Atributos();
        new Repair().accept(atributos,new SimpleCompositor());
        new Repair().accept(atributos,new TeXCompositor());
        new Repair().accept(atributos,new ArrayCompositor().apply(100));
    }
}
