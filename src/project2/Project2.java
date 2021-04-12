
package project2;

import java.util.Random;
import java.util.Scanner;


public class Project2 {

    public static void main(String[] args) {
      Deck deck = new Deck(); 
      PokerHand hand = new PokerHand(deck);
      PokerHand hand2= new PokerHand(deck);
      int playerMoney = 5;
      int machineMoney = 5;
      int pollMoney = 0;
      int sentinel = -1;
      int decision = 0;
      int quit = 0;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Your hand is: ");
        hand.displayAll();
        playerMoney-=1;
        machineMoney-=1;
        pollMoney = 2;
        System.out.println("Would you call (1) or raise (2) or quit(-1)?");
        decision = keyboard.nextInt();
        if(decision == -1){
            quit = -1;
        }
        else if (decision==1){
          System.out.println("The machine calls too and the winner is...");
          hand.call(hand2);
          if(hand.call(hand2)== PokerHand.Result.WIN) {
              System.out.println("The Player1 wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              playerMoney += pollMoney;
              pollMoney=0;
              
          }
          else if (hand.call(hand2)== PokerHand.Result.LOSE){
              System.out.println("The Machine wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              machineMoney += pollMoney;
              pollMoney=0;
          }
          else 
              System.out.println("The game ties, each of one win $"+ pollMoney/2);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              playerMoney += pollMoney/2;
              machineMoney += pollMoney/2;
              pollMoney=0;
        }
        else {
        playerMoney-=playerMoney;
        pollMoney +=1;   
        Random random = new Random();
        int machineDecision = random.nextInt(2);
        if (machineDecision == 1){
          System.out.println("The machine folds, Player1 wins, $"+ pollMoney);
          playerMoney += pollMoney;
          System.out.println("Would you like to play again, "
                  + "press any keyword or press -1 to quit.");
          playerMoney += pollMoney;
          pollMoney=0;
        }
        else{
          System.out.println("The machine calls and the winner is...");
          machineMoney-=machineMoney;
          pollMoney +=1;
          hand.call(hand2);
          if(hand.call(hand2)== PokerHand.Result.WIN) {
              System.out.println("The Player1 wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              playerMoney += pollMoney;
              pollMoney=0;
          }
          else if (hand.call(hand2)== PokerHand.Result.LOSE){
              System.out.println("The Machine wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
               machineMoney += pollMoney;
              pollMoney=0;
          }
          else {
              System.out.println("The game ties, each of one win $"+ pollMoney/2);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
               playerMoney += pollMoney/2;
              machineMoney += pollMoney/2;
              pollMoney=0;
                }
      
            }
        }
    
      
      while ((playerMoney!=0 || machineMoney!=0) && quit!=sentinel){
        
        
        System.out.println("Would you call (1) or raise (2) or quit(-1)?");
        decision = keyboard.nextInt();
       if(decision == -1){
            quit = -1;
        }
        else if (decision==1){
          System.out.println("The machine calls too and the winner is...");
          hand.call(hand2);
          if(hand.call(hand2)== PokerHand.Result.WIN) {
              System.out.println("The Player1 wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              playerMoney += pollMoney;
              pollMoney=0;
              
          }
          else if (hand.call(hand2)== PokerHand.Result.LOSE){
              System.out.println("The Machine wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              machineMoney += pollMoney;
              pollMoney=0;
          }
          else 
              System.out.println("The game ties, each of one win $"+ pollMoney/2);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              playerMoney += pollMoney/2;
              machineMoney += pollMoney/2;
              pollMoney=0;
        }
        else {
        playerMoney-=playerMoney;
        pollMoney +=1;   
        Random random = new Random();
        int machineDecision = random.nextInt(2);
        if (machineDecision == 1){
          System.out.println("The machine folds, Player1 wins, $"+ pollMoney);
          playerMoney += pollMoney;
          System.out.println("Would you like to play again, "
                  + "press any keyword or press -1 to quit.");
          playerMoney += pollMoney;
          pollMoney=0;
        }
        else{
          System.out.println("The machine calls and the winner is...");
          machineMoney-=machineMoney;
          pollMoney +=1;
          hand.call(hand2);
          if(hand.call(hand2)== PokerHand.Result.WIN) {
              System.out.println("The Player1 wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
              playerMoney += pollMoney;
              pollMoney=0;
          }
          else if (hand.call(hand2)== PokerHand.Result.LOSE){
              System.out.println("The Machine wins, $"+ pollMoney);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
               machineMoney += pollMoney;
              pollMoney=0;
          }
          else {
              System.out.println("The game ties, each of one win $"+ pollMoney/2);
              System.out.println("Would you like to play again, "
                      + "press any keyword or press -1 to quit.");
               playerMoney += pollMoney/2;
              machineMoney += pollMoney/2;
              pollMoney=0;
                }
      
            }
        }
    
        }
    }
}