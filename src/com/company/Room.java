package com.company;

public class Room {
    //what is in the room
    Monster monster;

    Room(){
        monster = new Monster();
    }

    public void go(Hero hero){
        while (hero.isAlive() && Monster.isAlive()) {
            monster.attack(hero);// hero: paramètre
            hero.attack(monster); // monster : variable
        }
    }
}
