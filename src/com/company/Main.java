package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

       // Display Menu
       boolean keepPlaying = true;

       while (keepPlaying) {
           System.out.println("Please select one option below");
           System.out.println("    - n : New Game");
           System.out.println("    - v : View Scores");
           System.out.println("    - q : Quit");
           Scanner scan = new Scanner(System.in);
           String userChoice = scan.nextLine();
           /*
           if (userChoice.equals("n")) {
               Game.startNewGame();
               Scores.enterScore(Game.m_iScore);
           } else if (userChoice.equals("v")) {
               Scores.viewScore();
           } else if (userChoice.equals("q")) {
               keepPlaying = false;
           } else {
               System.out.println("Sorry I did not understand your choice");
           }
           System.out.println("Thank you for playing the game, see you soon");

            */
       }

   }

}
