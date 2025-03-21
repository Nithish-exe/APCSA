import java.awt.*;
import java.util.ArrayList;


public class Hand {
    //cards a player has store ArrayList
    private ArrayList<Card> cards;
    //name
    private String playerName;


    /////////////////////////////
    //VARIABLES
    //score
    private int score;
    private final int maxScore;
    //the dealer
    private final Dealer theDealer;
    //done
    private boolean done;
    private boolean show;

    //Constructor
    //take in the location of the dealer
    public Hand(Dealer aDealer, String aName, boolean shouldShow) {
        done = false;
        show = shouldShow;

        maxScore = 21;
        cards = new ArrayList<Card>();
        theDealer = aDealer;
        aName = playerName;
        hit();
        hit();
    }

    public void playHand() {

    }

    /////////////////////////////
    //METHODS

    public int getScore() {
        int score = 0;

        return score;
    }

    //Hit*
    public boolean hit() {
        if (!done) {
            cards.add(theDealer.dealCard());
            return true;
        } else {
            return false;
        }
    }


    public void stand() {
        done = true;
    }

    public boolean isDone() {
        return done;
    }

    public void showHand() {
        show = true;
    }

    //Method To Draw All Its Cards
    public void drawCards(Graphics g, int x, int y) {

        String stringScore = ("" + getScore());
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 75, 75);

        if (!show) {
            if (cards.size() >= 1)
                cards.get(0).drawMyself(g, x + 200, y);
        } else {
            for (int counter = 0; counter < cards.size(); counter++) {
                cards.get(counter).drawMyself(g, x + 200 + counter * 100, y);
            }
            g.setColor(Color.PINK);
            g.drawString(stringScore, x + 10, y + 50);
        }

    }

    public void replaceCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}

