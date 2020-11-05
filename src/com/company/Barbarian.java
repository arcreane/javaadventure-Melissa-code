package com.company;

public class Barbarian {

    // attributes :
    public static String name = "Barbarian";
    public static String weapon = "axe";
    public static int lifePoints = 200;
    public static int damagePoints = 200;
    public static int attackPoints = 200;

    // behaviour :
    public static void attackFirst() {
        System.out.println();
        // Barbarian's attackPoints == Hero's damagePoints
    }

    // after the first Barbarian's attack
    public static void displayName(){
        System.out.println(name);
    }


    public static void die (){
        if (lifePoints == 0)
            System.out.println("The hero won and can now go in the next room");
            // Hero can continue moving forward
    }


}
