import java.awt.*;
import java.util.ArrayList;

public class TwentyOneTester {
    public static void main(String[] args) {
        testLevel6();
    }

    public static boolean testLevel6() {
        boolean result1 = testDealCard();
        boolean result2 = testGetValue();
        boolean result3 = testPlayHand();
        boolean result4 = testGetScore();
        if (result1 && result2 && result3 && result4) {
            System.out.println("Level 6 success!");
            return true;
        } else {
            System.out.println("Level 6 error.");
            return false;
        }
    }

    public static boolean testDealCardColor() {
        boolean success = true;
        int size = 2;
        double multiples = 2000;
        int[] results = new int[size];
        Dealer bob = new Dealer();
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            Card nextCard = bob.dealCard();
            if (!nextCard.getColor().equals(Color.BLACK) && !nextCard.getColor().equals(Color.RED)) {
                System.out.println("dealCard fails - Color");
                return false;
            }
            if (nextCard.getColor().equals(Color.BLACK)) {
                results[0] += 1;
            }
            if (nextCard.getColor().equals(Color.RED)) {
                results[1] += 1;
            }
        }
        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("dealCard fails - Color distribution");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testDealCardValue() {
        boolean success = true;
        int size = 13;
        double multiples = 2000;
        int[] results = new int[size];
        Dealer bob = new Dealer();
        for (int i = 0; i < results.length; i++) {
            results[i] = 0;
        }
        for (int n = 1; n < size * multiples; n++) {
            Card nextCard = bob.dealCard();
            if (nextCard.getNumber() < 2 || nextCard.getNumber() > 14) {
                System.out.println("dealCard fails - Number");
                return false;
            }
            results[nextCard.getNumber() - 2] += 1;
        }

        for (int i = 0; i < results.length; i++) {
            double offset = Math.abs(results[i] - multiples) / multiples;
            if (offset > .15) {
                System.out.println("dealCard fails - Number distribution");
                return false;
            } else {
                //System.out.println(offset);
            }
        }
        return success;
    }

    public static boolean testDealCard() {
        return testDealCardValue() && testDealCardColor();
    }

    public static boolean testGetValue() {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        for (int i = 0; i < values.length; i++) {
            Card nextCard = new Card(numbers[i], Color.BLUE);
            if (nextCard.getValue() != values[i]) {
                System.out.println("getValue fails");
                return false;
            }
        }
        return true;
    }

    public static boolean testPlayHand() {
        for (int n = 1; n <= 500; n++) {
            Hand theHand = new Hand(new Dealer(), "Bob", false);
            theHand.playHand();
            if (theHand.getScore() < 16 || theHand.getScore() > 26) {
                System.out.println("playHand fails");
                return false;
            }
        }
        return true;
    }

    public static boolean testGetScore() {
        Hand theHand = new Hand(new Dealer(), "Bob", false);
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(5, Color.BLACK));
        cards.add(new Card(7, Color.BLACK));
        cards.add(new Card(2, Color.BLACK));
        theHand.replaceCards(cards);
        if (theHand.getScore() != 14) {
            System.out.println("getScore fails - 1");
            return false;
        }
        cards = new ArrayList<Card>();
        cards.add(new Card(13, Color.BLACK));
        cards.add(new Card(12, Color.BLACK));
        cards.add(new Card(11, Color.BLACK));
        theHand.replaceCards(cards);
        if (theHand.getScore() != 30) {
            System.out.println("getScore fails - 2");
            return false;
        }
        cards = new ArrayList<Card>();
        cards.add(new Card(14, Color.BLACK));
        cards.add(new Card(8, Color.BLACK));
        cards.add(new Card(2, Color.BLACK));
        theHand.replaceCards(cards);
        if (theHand.getScore() != 21) {
            System.out.println("getScore fails - 3");
            return false;
        }
        cards = new ArrayList<Card>();
        cards.add(new Card(8, Color.BLACK));
        cards.add(new Card(2, Color.BLACK));
        cards.add(new Card(9, Color.BLACK));
        cards.add(new Card(14, Color.BLACK));
        theHand.replaceCards(cards);
        if (theHand.getScore() != 20) {
            System.out.println("getScore fails - 4");
            return false;
        }
        cards = new ArrayList<Card>();
        cards.add(new Card(14, Color.BLACK));
        cards.add(new Card(2, Color.BLACK));
        cards.add(new Card(4, Color.BLACK));
        cards.add(new Card(14, Color.BLACK));
        theHand.replaceCards(cards);
        if (theHand.getScore() != 18) {
            System.out.println("getScore fails - 5");
            return false;
        }
        cards = new ArrayList<Card>();
        cards.add(new Card(14, Color.BLACK));
        cards.add(new Card(2, Color.BLACK));
        cards.add(new Card(14, Color.BLACK));
        cards.add(new Card(14, Color.BLACK));
        cards.add(new Card(14, Color.BLACK));
        cards.add(new Card(14, Color.BLACK));
        cards.add(new Card(4, Color.BLACK));
        cards.add(new Card(14, Color.BLACK));
        theHand.replaceCards(cards);
        if (theHand.getScore() != 12) {
            System.out.println("getScore fails - 6");
            return false;
        }
        return true;
    }

}
