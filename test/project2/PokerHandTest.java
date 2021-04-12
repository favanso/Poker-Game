
package project2;

import java.util.Collections;
import org.junit.Test;
import static org.junit.Assert.*;

public class PokerHandTest {
    

    @Test
    public void CallWin() { 
       //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.ACE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.JACK, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.TEN, Card.Suit.SPADES));
        Collections.sort(player.newHand);
        
        PokerHand player2 = new PokerHand(deck);
        player2.newHand.clear();
        
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.CLUBS));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.DIAMONDS));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player2.newHand.add(new Card(Card.Face.TEN, Card.Suit.SPADES));
        Collections.sort(player2.newHand);
        
          PokerHand.Result expectedCallWin = PokerHand.Result.WIN;
    //Act
       PokerHand.Result actualCallWin = player.call(player2);
        
    //Assert
        assertEquals(expectedCallWin, actualCallWin);
}
    
    @Test
    public void CallLose() { 
       //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.DIAMONDS));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        Collections.sort(player.newHand);
        
        PokerHand player2 = new PokerHand(deck);
        player2.newHand.clear();
        
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.CLUBS));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.DIAMONDS));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player2.newHand.add(new Card(Card.Face.TEN, Card.Suit.SPADES));
        Collections.sort(player2.newHand);
        
          PokerHand.Result expectedCallLose = PokerHand.Result.LOSE;
    //Act
       PokerHand.Result actualCallLose = player.call(player2);
        
    //Assert
        assertEquals(expectedCallLose, actualCallLose);
}

    @Test
    public void CallTie() { 
       //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.DIAMONDS));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        Collections.sort(player.newHand);
        
        PokerHand player2 = new PokerHand(deck);
        player2.newHand.clear();
        
        player2.newHand.add(new Card(Card.Face.KING, Card.Suit.SPADES));
        player2.newHand.add(new Card(Card.Face.KING, Card.Suit.CLUBS));
        player2.newHand.add(new Card(Card.Face.KING, Card.Suit.DIAMONDS));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player2.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        Collections.sort(player2.newHand);
        
          PokerHand.Result expectedCallTie = PokerHand.Result.DRAW;
    //Act
       PokerHand.Result actualCallTie = player.call(player2);
        
    //Assert
        assertEquals(expectedCallTie, actualCallTie);
}
    
    @Test
    public void testStraightFlush() {
     //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.ACE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.JACK, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.TEN, Card.Suit.SPADES));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.STRAIGHT_FLUSH;
    //Act
       PokerHand.Rank actualStraightFlush = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualStraightFlush);
    }
        
@Test
    public void isFourOfAKind() {
    //Arrange
        Deck deck = new Deck();
        
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.DIAMONDS));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.TEN, Card.Suit.SPADES));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.FOUR_OF_A_KIND;
    //Act
       PokerHand.Rank actualFourOfAKind = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualFourOfAKind);
        
    }
    
    @Test
    public void isFullHouse() {
    //Arrange
        Deck deck = new Deck();
        
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.DIAMONDS));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.FULL_HOUSE;
    //Act
       PokerHand.Rank actualFullHouse = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualFullHouse);
    }
    
    @Test
    public void isFlush() {
    //Arrange
        Deck deck = new Deck();
        
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.KING, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.JACK, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.NINE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.TWO, Card.Suit.SPADES));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.FLUSH;
    //Act
       PokerHand.Rank actualFullHouse = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualFullHouse);
    } 
    
    @Test
    public void isStraight() {
    //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.JACK, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.TEN, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.NINE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.EIGHT, Card.Suit.CLUBS));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.STRAIGHT;
    //Act
       PokerHand.Rank actualStraight = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualStraight);
    } 
    
    @Test
    public void isThreeOfAKind() {
    //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.NINE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.EIGHT, Card.Suit.CLUBS));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.THREE_OF_A_KIND;
    //Act
       PokerHand.Rank actualThreeOfAKind = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualThreeOfAKind);
    } 
    
    @Test
    public void isTwoPair() {
    //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.QUEEN, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.JACK, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.JACK, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.EIGHT, Card.Suit.CLUBS));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.TWO_PAIR;
    //Act
       PokerHand.Rank actualTwoPair = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualTwoPair);
    } 
    
    @Test
    public void isPair() {
    //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.ACE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.ACE, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.NINE, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.SIX, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.FOUR, Card.Suit.CLUBS));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.PAIR;
    //Act
       PokerHand.Rank actualPair = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualPair);
    }
    
    @Test
    public void isHighCard() {
    //Arrange
        Deck deck = new Deck();
        PokerHand player = new PokerHand(deck);
        player.newHand.clear();
        
        player.newHand.add(new Card(Card.Face.ACE, Card.Suit.SPADES));
        player.newHand.add(new Card(Card.Face.SEVEN, Card.Suit.CLUBS));
        player.newHand.add(new Card(Card.Face.FIVE, Card.Suit.HEART));
        player.newHand.add(new Card(Card.Face.THREE, Card.Suit.DIAMONDS));
        player.newHand.add(new Card(Card.Face.TWO, Card.Suit.CLUBS));
        Collections.sort(player.newHand);
        PokerHand.Rank expectedRank = PokerHand.Rank.HIGH_CARD;
    //Act
       PokerHand.Rank actualHighCard = player.getHandRank();
        
    //Assert
        assertEquals(expectedRank, actualHighCard);
    } 
}

    

