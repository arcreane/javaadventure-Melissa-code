package com.company;

public class Dungeon {

    Room[] rooms;

    Dungeon() {
        rooms = new Room[5];
        // to have a new room
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(); // each room has something
        }
    }

    public void welcome(Hero hero) {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i].go(hero);
            if (!hero.isAlive()) {
                break;
            }
            if (hero.isAlive()) {
                System.out.println("Congratulations, you won !");
            } else {
                System.out.println("Sorry, you lost");
            }
        }
    }
}
