package com.company;

public class Room {
    //what is in the room
    Monster monster;

    Room(){
        monster = new Monster();
    }

    public void go(Hero hero){
        monster.attack(hero);
    }
}
