package com.company;

import java.util.Arrays;
import org.w3c.dom.ls.LSOutput;

public class Hero {

    // attributes :
    String weaponBarbarian = "Sword";
    String weaponWizard = "Water_Flask";
    String[] monstersArray = new String["Barbarian","Wizard"];
    int lifePoints = 200;
    int damagePoints = 200;
    int attackPoints = 200;


    // Behaviour :
    moveForward() {
        // if Barbarian dies || Wizard dies
        // Hero moves Forward in the next room
        System.out.println();
    }

    AttackMonsters() {
        if (displayName == Barbarian.name){
        System.out.println(weaponBarbarian);
        // and throw a Sword
        } else if (displayName == Wizard.name){
        System.out.println(weaponWizard);}
        // and throw a Water_Flask
        // and Hero's attackPoints == Monster's damagePoints
    }

    reachTreasure(){
            // if Barbarian dies && Wizard dies
        System.out.println("Congratulations, you win !");
        // stop the game and return to the Menu
        }


    die() {
        if (lifePoints == 0){
            System.out.println("You're dead");}
        // and return to the Menu
    }

}
