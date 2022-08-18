package br.com.bb.cloud74.factoryMethod.OO;

public class MazeGame {
    public Maze CreateMaze(){
        Maze aMaze = new Maze();

        // Criando labirinto
        // ...

        return aMaze;
    }
    Maze MakeMaze(){
        return new Maze();
    }
    Room MakeRoom (Integer n){
        return new Room(n);
    }
    Wall MakeWall(){
        return new Wall();
    }
    Door MakeDoor(Room r1, Room r2){
        return new Door(r1,r2);
    }
}
