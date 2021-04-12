package project2;

import java.util.ArrayList;
import java.util.Collections;


public class PokerHand {
  public ArrayList<Card> newHand = new ArrayList<>();
  
  public PokerHand(Deck deck){  
    for (int x=0; x<5; x++)
        {
            Card tempCard = deck.getRandomCard();
            newHand.add(tempCard); 
        }
    Collections.sort(newHand);
     }
  
  void displayAll()
    {
     System.out.println(newHand);  
    }
  
  enum Rank{HIGH_CARD, PAIR, TWO_PAIR, THREE_OF_A_KIND, STRAIGHT, FLUSH, 
  FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH
    };
  
  enum Result {WIN, DRAW, LOSE;}
    

public Result call(PokerHand otherHand) {
        if (getHandRank().ordinal() > otherHand.getHandRank().ordinal()) {
            return Result.WIN;
        }

        if (getHandRank().ordinal() < otherHand.getHandRank().ordinal()) {
            return Result.LOSE;
        }
        
       	else return Result.DRAW;
                              
}        
        
public Rank getHandRank() {
        if (isStraightFlush()) {
            return Rank.STRAIGHT_FLUSH;
        }
        else if (isFourOfAKind()) {
            return Rank.FOUR_OF_A_KIND;
        }
        else if (isFullHouse()) {
            return Rank.FULL_HOUSE;
        }
        else if (isFlush()) {
            return Rank.FLUSH;
        }
        else if (isStraight()) {
            return Rank.STRAIGHT;
        }
        else if (isThreeOfAKind()) {
            return Rank.THREE_OF_A_KIND;
        }
        else if (isTwoPair()) {
            return Rank.TWO_PAIR;
        }
        else if (isPair()) {
            return Rank.PAIR;
        }
  
        else return Rank.HIGH_CARD; 
    }

    private boolean isStraightFlush() {
        return newHand.get(0).getFace().ordinal()+1 == newHand.get(1).getFace().ordinal()&&
               newHand.get(1).getFace().ordinal()+1 == newHand.get(2).getFace().ordinal()&&
               newHand.get(2).getFace().ordinal()+1 == newHand.get(3).getFace().ordinal()&&
               newHand.get(3).getFace().ordinal()+1 == newHand.get(4).getFace().ordinal()&&
               newHand.get(0).getSuit() == newHand.get(1).getSuit()&&
               newHand.get(1).getSuit() == newHand.get(2).getSuit()&&
               newHand.get(2).getSuit() == newHand.get(3).getSuit()&&
               newHand.get(3).getSuit() == newHand.get(4).getSuit();
    }

    private boolean isFourOfAKind() {
        
        return newHand.get(0).getFace() == newHand.get(1).getFace()&&
                newHand.get(0).getFace() == newHand.get(2).getFace()&&
                newHand.get(0).getFace() == newHand.get(3).getFace();
    }

    private boolean isFullHouse() {
        return (newHand.get(0).getFace() == newHand.get(1).getFace()&&
                newHand.get(0).getFace() == newHand.get(2).getFace()&&
                newHand.get(3).getFace() == newHand.get(4).getFace())||
               (newHand.get(0).getFace() == newHand.get(1).getFace()&&
                newHand.get(2).getFace() == newHand.get(3).getFace()&&
                newHand.get(2).getFace() == newHand.get(4).getFace());
                
    }

    private boolean isFlush() {
        
        return  newHand.get(0).getSuit() == newHand.get(1).getSuit()&&
               newHand.get(1).getSuit() == newHand.get(2).getSuit()&&
               newHand.get(2).getSuit() == newHand.get(3).getSuit()&&
               newHand.get(3).getSuit() == newHand.get(4).getSuit()&&
               (newHand.get(0).getFace().ordinal()+1 != newHand.get(1).getFace().ordinal()||
               newHand.get(1).getFace().ordinal()+1 != newHand.get(2).getFace().ordinal()||
               newHand.get(2).getFace().ordinal()+1 != newHand.get(3).getFace().ordinal()||
               newHand.get(3).getFace().ordinal()+1 != newHand.get(4).getFace().ordinal());  
    }
    
    private boolean isStraight() {
        
        return newHand.get(0).getFace().ordinal()+1 == newHand.get(1).getFace().ordinal()&&
               newHand.get(1).getFace().ordinal()+1 == newHand.get(2).getFace().ordinal()&&
               newHand.get(2).getFace().ordinal()+1 == newHand.get(3).getFace().ordinal()&&
               newHand.get(3).getFace().ordinal()+1 == newHand.get(4).getFace().ordinal()&&
               (newHand.get(0).getSuit() != newHand.get(1).getSuit()||
               newHand.get(1).getSuit() != newHand.get(2).getSuit()||
               newHand.get(2).getSuit() != newHand.get(3).getSuit()||
               newHand.get(3).getSuit() != newHand.get(4).getSuit());
        
    }
    
    private boolean isThreeOfAKind() {
        return (newHand.get(0).getFace() == newHand.get(1).getFace()&&
                newHand.get(0).getFace() == newHand.get(2).getFace()&&
                newHand.get(3).getFace() != newHand.get(4).getFace())||
               (newHand.get(0).getFace() != newHand.get(1).getFace()&&
                newHand.get(2).getFace() == newHand.get(3).getFace()&&
                newHand.get(2).getFace() == newHand.get(4).getFace());
    }
    
    private boolean isTwoPair() {
        return (newHand.get(0).getFace() == newHand.get(1).getFace()&&
                newHand.get(2).getFace() == newHand.get(3).getFace())||
               (newHand.get(1).getFace() == newHand.get(2).getFace()&&
                newHand.get(3).getFace() == newHand.get(4).getFace());
               
    }

    private boolean isPair() {
       return (newHand.get(0).getFace() == newHand.get(1).getFace()&&
               newHand.get(2).getFace() != newHand.get(3).getFace()&&
               newHand.get(3).getFace() != newHand.get(4).getFace())||
               (newHand.get(1).getFace() == newHand.get(2).getFace()&&
               newHand.get(0).getFace() != newHand.get(1).getFace()&&
               newHand.get(2).getFace() != newHand.get(3).getFace()&&
               newHand.get(3).getFace() != newHand.get(4).getFace())||
               (newHand.get(2).getFace() == newHand.get(3).getFace()&&
               newHand.get(0).getFace() != newHand.get(1).getFace()&&
               newHand.get(1).getFace() != newHand.get(2).getFace()&&
               newHand.get(3).getFace() != newHand.get(4).getFace())||
               (newHand.get(3).getFace() == newHand.get(4).getFace()&&
               newHand.get(0).getFace() != newHand.get(1).getFace()&&
               newHand.get(1).getFace() != newHand.get(2).getFace()&&
               newHand.get(2).getFace() != newHand.get(3).getFace());
    }
    
}
    


