package com.company;

public class Wizard {

    // attributes :
    String name = "Wizard"
    String weapon = "Thunderbolt";
    int lifePoints = 200;
    int damagePoints = 200;
    int attackPoints = 200;

    // behaviour :
    attackFirst() {
        System.out.println();
        // Wizard's attackPoints == Hero's damagePoints
    }

    // after the first Wizard's attack
    displayName(){
        System.out.println(name);
    }

    die (){
        if (lifePoints == 0){
            System.out.println("The hero won and can go in the next room");
            // Hero can continue moving forward
        }
    }
}
