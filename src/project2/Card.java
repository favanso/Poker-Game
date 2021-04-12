
package project2;


public class Card implements Comparable<Card>{

    
    public enum Face {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;}

  public enum Suit {
      DIAMONDS, SPADES, HEART, CLUBS;
    }    

   public Face face;
   public Suit suit;
   
   public Card(Face face,Suit suit){
       this.face = face;
       this.suit = suit;         
   }
   
    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }
    public Card(Card cardCopy){
        this.face = cardCopy.face;
        this.suit = cardCopy.suit;
    }

    @Override
    public String toString() {
        return face +" of " + suit;
    }
    
    @Override
    public int compareTo(Card other) {
         if (this.face.ordinal() > other.face.ordinal()){
                return 1;}
            else if (this.face.ordinal() < other.face.ordinal()){
                return -1;
        }
        return 0;
    }       
}
