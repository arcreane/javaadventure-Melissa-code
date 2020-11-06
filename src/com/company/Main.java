package com.company;

import java.util.Scanner;

public class Main {

   // public static boolean keepPlaying = true;

   public static void main(String[] args) {
        //displayMenu();

       Hero hero = new Hero();
       Dungeon dungeon = new Dungeon();
       dungeon.welcome(hero); // method in Dungeon

       }

   }
   /*
       public static void displayMenu(){

       while (keepPlaying) {
           System.out.println("Please select one option below");
           System.out.println("    - n : New Game");
           System.out.println("    - q : Quit");

           Scanner scan = new Scanner(System.in);
           String userChoice = scan.nextLine();

           if (userChoice.equals("n")) {
               Game.startNewGame();
           } else if (userChoice.equals("q")) {
               keepPlaying = false;
           } else {
               System.out.println("Sorry I did not understand your choice");
           }
           System.out.println("Thank you for playing the game, see you soon");
        }

   }

}*/ 
