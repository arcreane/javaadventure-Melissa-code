package com.company;

public class Dungeon {

    public Room[] rooms;

    public Dungeon(){
        rooms = new Room[5];
        // to have a new room
        for (i = 0; i < rooms.length; i ++)
            rooms[i] = new Room(); // each room has something
    }



}
