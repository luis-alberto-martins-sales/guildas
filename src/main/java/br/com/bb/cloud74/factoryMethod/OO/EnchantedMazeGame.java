package br.com.bb.cloud74.factoryMethod.OO;

public class EnchantedMazeGame extends MazeGame{
    Room MakeRoom (Integer n){
        return new EnchantedRoom(n, new Spell());
    }

    Door MakeDoor(Room r1, Room r2){
        return new DoorNeedingSpell(r1,r2);
    }
}
