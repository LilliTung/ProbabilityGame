package com.mycompany.probabilitygame;

import java.util.Scanner;
import java.lang.Math;

public class ProbabilityGame {

    public static void main(String[] args) 
    {
    int dice1 = 0;
    int dice2= 0;
    int sumDice = 0;
    int spinner = 0;
    int coin = 0;
    // 1 heads, 2 tails
    boolean play = false;
    int count = 0;
    Scanner input = new Scanner(System.in);
    String user = "";
        
    System.out.println("Welcome to Lilli's probability Game!\nTo play this game two six-sided dice will be rolled,\na spinner from 1-12 will be spun,\nand a coin will be flipped.\nThere are three possibilites to win:");
    System.out.println("1. Roll an even sum of two dice,\n\tspin the same number on the spinner,\n\tand flip heads");
    System.out.println("2. Roll an odd sum of two dice,\n\tspin an even number on the spinner,\n\tand flip tails");
    System.out.println("3. Roll doubles or a sum of 7,\n\tspin a 6 or above,\n\tand flip tails");
    System.out.println("Are you ready to play? (y/n)");
    user = input.next();
    if(user.toLowerCase().equals("y"))
    {
      play = true;
    }
    else if(user.toLowerCase().equals("n"))
    {
      System.out.println("See you next time!");
    }
    else
    {
      System.out.println("Must enter either y or n");
    }
    
    while (play && count<20)
    {
      // "roll" "spin" "flip"
      dice1 = (int) (Math.random()*6) + 1;
      dice2 = (int) (Math.random()*6) + 1;
      sumDice = dice1 + dice2;
      spinner = (int) (Math.random()*12) + 1;
      coin = (int) (Math.random()*2) + 1;

      System.out.println("DIE 1: " + dice1);
      System.out.println("DIE 2: " + dice2);
      System.out.println("SUM OF DICE: " + sumDice);
      System.out.println("SPINNER: " + spinner);
      if(coin==1)
      {
        System.out.println("COIN: heads");
      }
      else if (coin == 2)
      {
        System.out.println("COIN: tails");
      }
      
      System.out.println();
      
      if(sumDice%2 == 0 && sumDice == spinner && coin == 1)
      {
        System.out.println("WIN! (Option 1)");
        System.out.println ("+$10.00\n");
      }
      else if(sumDice%2 != 0 && spinner%2 == 0 && coin == 2)
      {
        System.out.println("WIN (Option 2)");
        System.out.println ("+$2.00\n");
      }
      else if((dice1 == dice2 || sumDice == 7) && spinner>=6 && coin == 2)
      {
        System.out.println("WIN (Option 3)");
        System.out.println ("+$3.00\n");
      }
      else
      {
        System.out.println("LOSE");
        System.out.println("Better Luck Next Time\n");
      }
      count ++;
      
    }
    }
}
