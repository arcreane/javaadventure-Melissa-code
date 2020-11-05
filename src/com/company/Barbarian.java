package com.company;

public class Barbarian {

    // attributes :
    String name = "Barbarian";
    String weapon = "axe";
    int lifePoints = 200;
    int damagePoints = 200;
    int attackPoints = 200;

    // behaviour :

    attackFirst() {
        System.out.println();
        // Barbarian's attackPoints == Hero's damagePoints
    }

    // after the first Barbarian's attack
    displayName(){
        System.out.println(name);
    }


    die (){
        if (lifePoints == 0)
            System.out.println("The hero won and can now go in the next room");
            // Hero can continue moving forward
    }


}
