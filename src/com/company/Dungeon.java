package com.company;

public class Dungeon {

    Room[] rooms;

    Dungeon(){
        rooms = new Room[5];
        // to have a new room
        for (i = 0; i < rooms.length; i ++)
            rooms[i] = new Room(); // each room has something
    }

    public void welcome(Hero hero) {
        for (i=0; i<rooms.length; i ++){
            rooms[i].go(hero);
        }
    }
}
