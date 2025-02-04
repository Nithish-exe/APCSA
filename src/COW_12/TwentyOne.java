import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TwentyOne extends JPanel implements ActionListener {
    //VARIABLES
    //Dealer
    private final Dealer theDealer;

    //ArrayList of Hands
    private ArrayList<Hand> hands;

    private final Button buttonHit1;
    private final Button buttonStand1;
    private final Button resetButton;

    public TwentyOne() {
        setLayout(null);

        theDealer = new Dealer();
        hands = new ArrayList<Hand>();
        hands.add(new Hand(theDealer, "Bob", true));
        hands.add(new Hand(theDealer, "Dealer", false));

        buttonHit1 = new Button("Hit");
        buttonHit1.setBounds(150, 30, 50, 30);
        buttonHit1.addActionListener(this);
        add(buttonHit1);

        buttonStand1 = new Button("Stand");
        buttonStand1.setBounds(150, 80, 50, 30);
        buttonStand1.addActionListener(this);
        add(buttonStand1);

        resetButton = new Button("Reset");
        resetButton.setBounds(150, 130, 50, 30);
        resetButton.addActionListener(this);
        add(resetButton);
    }

    public static void main(String[] arg) {
        JFrame frame = new JFrame();
        TwentyOne cardTable = new TwentyOne();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(700, 500);
        frame.setLocation(0, 0);
        frame.getContentPane().add(cardTable);
        //frame.setLayout(null);
        frame.setVisible(true);
        cardTable.repaint();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonHit1) {
            hands.get(0).hit();
        } else if (e.getSource() == buttonStand1) {
            hands.get(0).stand();
        } else if (e.getSource() == resetButton) {
            hands = new ArrayList<Hand>();
            hands.add(new Hand(theDealer, "Bob", true));
            hands.add(new Hand(theDealer, "Dealer", false));
        }
        if (hands.get(0).isDone()) {
            hands.get(1).playHand();
            hands.get(1).showHand();
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(new Color(0, 100, 0));
        g.fillRect(0, 0, 1000, 1000);
        if (hands.size() > 0) {
            for (int counter = 0; counter < hands.size(); counter++) {
                hands.get(counter).drawCards(g, 30, 30 + counter * 100);
            }
        }

    }

}
