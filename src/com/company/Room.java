package com.company;

public class Room {
    //what is in the room
    public Barbarian barbarian;

    public Room(){
        barbarian = new Barbarian();
    }

    public void go(Hero hero){
        barbarian.attack(hero);
    }
}
