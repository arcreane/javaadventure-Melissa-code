package com.company;

public class Monster {

    int lifePoints;
    Weapon weapon;
    String barbarian;
    String wizard;

    // constructor
    Monster(){
        lifePoints = 10;
        weapon = new Weapon();
        barbarian = new String();
        wizard = new String();
    }

    public boolean isAlive() {
        return lifePoints > 0;
    }

    // method
    public void attack(Hero hero){
        hero.looseLifePoints(weapon.damagePoints);
    }


    public boolean inflictDamage(int damagePoints) {
        lifePoints -= damagePoints;
        if (lifePoints < 0) {
            System.out.println("The monster has taken "+ damagePoints+" damage points. He has now "+ lifePoints +" life points.");
        } else {
            System.out.println("The monster is dead.");
        }
        return isAlive();
    }
}
