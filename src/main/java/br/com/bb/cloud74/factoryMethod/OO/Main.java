package br.com.bb.cloud74.factoryMethod.OO;

public class Main {
    public static void main(String[] args) {
        /*GAMMA, Erich; HELM, Richard; JOHNSON, Ralph; et al.
        Padrões de projetos: soluções reutilizáveis de software orientados a objetos.
        Grupo A, 2000. E-book. 9788577800469, p. 118-120.
        Disponível em: https://unibb.minhabiblioteca.com.br/#/books/9788577800469/.
        Acesso em: 18 ago. 2022.*/
        Maze maze = new MazeGame().CreateMaze();
        Maze bombedMaze = new BombedMazeGame().CreateMaze();
        Maze enchantedMaze = new EnchantedMazeGame().CreateMaze();
    }
}
