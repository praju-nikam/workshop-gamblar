package com.java;

import java.util.Scanner;

public class GamblerWInLoose
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value : ");
        int bet = scanner.nextInt();
          if( bet > 0)
            {
                System.out.println("Gambler is Win");
            }
             else
            {
                System.out.println("Gambler is Loose");
            }

    }
}
