package com.company;

public class Room {
    //what is in the room
    Barbarian barbarian;

    Room(){
        barbarian = new Barbarian();
    }

    public void go(Hero hero){
        barbarian.attack(hero);
    }
}
