package com.game;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       int gameNumber = (int)(Math.random()*100);
       int userNumber = 0;

       do {
           System.out.println("Guess number in (1-100) : ");
           userNumber = sc.nextInt();

           if(userNumber == gameNumber) {
               System.out.println("YOU GUESSED CORRECT !!!");
               break;
           }
           else if(userNumber > gameNumber) {
               System.out.println("your number is too large");
           }
           else {
               System.out.println("your number is too small");
           }
       } while(userNumber >= 0);

       System.out.print("Game number was : ");
       System.out.println(gameNumber);
    }
}