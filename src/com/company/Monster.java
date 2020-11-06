package com.company;

public class Monster {

    int lifePoints;
    Weapon weapon;

    // constructor
    Monster(){
        lifePoints = 10;
        weapon = new Weapon;
    }

    // method
    public void attack(Hero hero){
        hero.looseLifePoints(arrow.damagePoints);
    }


}
