package br.com.bb.cloud74.factoryMethod.OO;

public class BombedMazeGame extends MazeGame{

    @Override
    Wall MakeWall(){
        return new BombedWall();
    }

    Room MakeRoom (Integer n){
        return new RoomWithABomb(n);
    }
}
