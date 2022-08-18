package br.com.bb.cloud74.factoryMethod.funcional;


import java.util.function.Function;

public class MazeGame implements Function<Function[],Maze> {

    @Override
    public Maze apply(Function[] funcs) {

        Function MakeRoom = funcs[0];
        Function MakeWall = funcs[1];
        Function MakeDoor = funcs[2];

        // Criando labirinto
        // ...

        return null;
    }
}
