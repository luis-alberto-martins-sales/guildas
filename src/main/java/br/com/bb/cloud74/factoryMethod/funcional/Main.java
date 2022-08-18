package br.com.bb.cloud74.factoryMethod.funcional;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Room> MakeRoom=Room::new;
        //Supplier
        Function<Object,Wall> MakeWall = (o)->new Wall();
        //BiFunction
        //Currying
        Function<Room,Function<Room,Door>> MakeDoor = r1 -> r2 -> new Door(r1,r2);

        Maze maze = new MazeGame().apply(new Function[]{MakeRoom,MakeWall,MakeDoor});

        Function<Integer,Room> MakeRoomWithABomb = RoomWithABomb::new;
        Function<Object,Wall> MakeBombedWall = (o)->new BombedWall();
        Maze bombedMaze = new MazeGame()
                .apply(new Function[]{MakeRoomWithABomb,MakeBombedWall,MakeDoor});

        Function<Integer,Function<Spell,Room>> MakeEnchantedRoom =
                n->spell->new EnchantedRoom(n,spell);
        Function<Room,Function<Room,Door>> MakeDoorNeedingSpell =
                r1 -> r2 -> new DoorNeedingSpell(r1,r2);
        Maze enchantedMaze = new MazeGame()
                .apply(new Function[]{MakeEnchantedRoom,MakeWall,MakeDoorNeedingSpell});
    }
}
