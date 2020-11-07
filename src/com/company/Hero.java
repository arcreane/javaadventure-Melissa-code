package com.company;

public class Hero {

    int lifePoints;
    Weapon sword;
    Weapon waterFlask;

    // constructor
    Hero(){
        lifePoints = 20;
    }

    //method
    public void looseLifePoints(int damagePoints){
        lifePoints -= damagePoints;
        if (lifePoints < 0) {
            System.out.println("You're dead.");
        } else {
            System.out.println("You have suffered " + damagePoints+ ", You have now " + lifePoints +" life points.");
        }
    }

    public boolean isAlive() {
        return lifePoints > 0;
    }

    public boolean attack(Monster monster) {
        return monster.inflictDamage(sword.damagePoints);
    }

    /*
    // attributes :
    public static String weaponBarbarian = "Sword";
    public static String weaponWizard = "Water_Flask";
    public static String[] monstersArray = new String["Barbarian","Wizard"];
    public static int lifePoints = 20;


    // Behaviour :
    public static void moveForward() {
        // if Barbarian dies | Wizard dies
        // Hero moves Forward in the next room
        System.out.println();
    }

    public static void AttackMonsters() {
        if (displayName == Barbarian.name){
        System.out.println(weaponBarbarian);
        // and throw a Sword
        } else if (displayName == Wizard.name){
        System.out.println(weaponWizard);}
        // and throw a Water_Flask
        // and Hero's attackPoints == Monster's damagePoints
    }

    public static void reachTreasure(){
        // if Barbarian dies & Wizard dies
        System.out.println("Congratulations, you win !");
        // stop the game and return to the Menu
        }


    public static void die() {
        if (lifePoints == 0){
            System.out.println("You're dead");}
            // and return to the Menu
    }
*/

}
