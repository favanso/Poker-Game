package project2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* I used as reference this follow websites/codes:
https://github.com/EricCharnesky/CIS2151-Winter2021/blob/e7b83e58aabf861df7683d
940bee08ccf503fe72/Chapte6Review/src/chapte6review/PowerBallTicket.java
https://github.com/EricCharnesky/CIS2151-Winter2021/tree/e7b83e58aabf861df7683d
940bee08ccf503fe72/Chapter8Part1
https://github.com/EricCharnesky/CIS2151-Winter2021/blob/main/Chapter9/src/
chapter9/Chapter9.java 
https://github.com/EricCharnesky/CIS2151-Winter2021/tree/main/Project2/src/project2
*/

public class Deck {
    private final ArrayList<Card> cards;
    
    public Deck(){
          
  cards = new ArrayList<>();    
    
   for (Card.Suit s : Card.Suit.values()){
        for (Card.Face r : Card.Face.values()){
               cards.add( new Card(r,s));
             }
    }
 //for (int i=0 ; i < cards.size();i++){
   //   System.out.println((i+1)+" "+cards.get(i).toString()); 
  //}
}   

    public ArrayList<Card> getCards() {
      
      return cards;
    }
    
    public Card getRandomCard(){
        Collections.shuffle(cards, new Random());
        Card oneCard = cards.remove(0);
        return oneCard;
    }

}      
