package com.java;

public class Gambler
{
    public static final int STACK = 100;
    public static final int BET = 1;

    public void WinLose()
    {
        boolean check = (Math.random() < 0.5);
        if(check )
        {
            System.out.println("Player Win");
        }
        else
        {
            System.out.println("Player is Loose");
        }
    }
  public static void main(String args[])
  {
      System.out.println("Welcome to Gambler");
         Gambler gambler = new Gambler();
         gambler.WinLose();
  }
}
