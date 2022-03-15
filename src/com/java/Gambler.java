package com.java;

public class Gambler
{
    public static final int STACK = 100;
    public static final int BET = 1;
    public static final boolean check = (Math.random() < 0.5);

    // Use case 2 Gambler Win or Loose
    public boolean winOrLose()
    {
        boolean check = (Math.random() < 0.5);
        if(check )
        {
            System.out.println("Player Win" );
        }
        else
        {
            System.out.println("Player is Loose" );
        }
        return check;
    }

    /* Use case 3 Gambler if Won or Lost 50% of the Stake,
       would resign for the day
   */
    public int playGame()
    {
        int stake     = 100;
        int winLimit  = 150;
        int loseLimit = 50;

        while(stake < winLimit && stake > loseLimit)
        {
            if(winOrLose())
            {
                stake = stake + 1;
                System.out.println(stake+" ");
            }
            else
            {
                stake = stake - 1;
                System.out.println(stake+" ");
            }
        }
        return stake;
    }
    /*
       Use case 4 After 20 days playing every day
        calculate total Amount
     */
    public  void calTotalAmount()
    {
        int winLimit  = 150;
        int loseLimit = 50;
        int winCount  = 0;
        int loseCount = 0;
        int days      = 20;
        int totalWinAmount;
        int totalLoseAmount;

        for(int index = 0; index < days; index++)
        {
            int count = playGame();
            if(count == winLimit)
            {
                winCount++;
            }
            else if(count == loseLimit)
            {
                loseCount++;
            }
        }
        totalWinAmount = winLimit * winCount;
        totalLoseAmount = loseLimit * loseCount;
        System.out.println(" Win Count in 20 days        : " +winCount);
        System.out.println(" Lose Count in count 20 days : " +loseCount);
        System.out.println("Total Win Amount in 20 days  : ( " +winLimit+ " * " +winCount+ " ) : " +totalWinAmount);
        System.out.println("Total Win Amount in 20 days  : ( " +loseLimit+ " * " +loseCount+ " ) : " +totalLoseAmount);
    }

    /*
      Use Case 5 Each month would like to know the days won
      and lost and by how much
    */
    public void calculateMonthly()
    {
        int      winLimit = 150;
        int     loseLimit = 50;
        int      winCount = 0;
        int     loseCount = 0;
        int          days = 30;
        int wonBYHowMuch  = 0 ;
        int lostByHowMuch = 0;

        for(int index = 0; index < days; index++)
        {
            int count = playGame();
            if(count == winLimit)
            {
                wonBYHowMuch = wonBYHowMuch + count;
                winCount++;
            }
            else if(count == loseLimit)
            {
                lostByHowMuch = lostByHowMuch + count;
                loseCount++;
            }
        }

        System.out.println(" Win Count in 30 days        : " +winCount);
        System.out.println(" Lose Count in count 30 days : " +loseCount);
        System.out.println(" Won By  : " +wonBYHowMuch);
        System.out.println(" Lost By : " +lostByHowMuch);

    }
    /*
        Use case 6 Check Luckiest Day & Unluckiest Day
     */
    public void checkLuckyOrUnluckyDay()
    {

        int      winLimit = 150;
        int     loseLimit = 50;
        int      winCount = 0;
        int     loseCount = 0;
        int          days = 30;
        int     luckyDay  = 0 ;
        int    unLuckyDay = 0;
        int           day = 0;

        for(int index = 0 ; index < days ; index++ , day++)
        {
            int count = playGame();
            if(count == winLimit )
            {
                winCount++;
                luckyDay = day ;
                System.out.println("Luckyiest Day            : " +luckyDay);
            }
            else if(count == loseLimit)
            {
                loseCount++ ;
                unLuckyDay = day  ;
                System.out.println("Unluckyiest Day         : " +unLuckyDay);
            }
        }

        System.out.println("In Month Luckiest Days   : " +winCount);
        System.out.println("In Month Unluckiest Days : " +loseCount);
    }

    public static void main(String[] args)
    {
        System.out.println("-*-*-*-*-*-*- Welcome to Gambler -*-*-*-*-*-*-");
        Gambler gambler = new Gambler();
        gambler.winOrLose();
        gambler.playGame();
        gambler.calTotalAmount();
        gambler.calculateMonthly();
        gambler.checkLuckyOrUnluckyDay();


    }
}
