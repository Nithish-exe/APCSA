import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Roulette extends JPanel implements ActionListener {
    private final String[] buttonNames = {"Bet Odd", "Bet Even", "Bet 1st", "Bet 2nd", "Bet 3rd", "Bet Random Number", "Spin", "Reset"};
    private int amountOnOdd, amountOnEven, amountOn1stThird, amountOn2ndThird, amountOn3rdThird;
    private ArrayList<Integer> numberBets;

    //********DO NOT EDIT CODE BELOW*******************************//
    private final Wheel theWheel;
    public Roulette() {
        setLayout(null);
        theWheel = new Wheel();

        int y = 0;
        for (String next : buttonNames) {
            Button nextButton = new Button(next);
            nextButton.setBounds(0, y * 50, 200, 50);
            nextButton.setActionCommand(next);
            add(nextButton);
            nextButton.addActionListener(this);
            y += 1;
        }
        reset();
    }

    public static void main(String[] arg) {
        JFrame frame;

        frame = new JFrame("Roulette");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(615, 600);
        frame.setLocation(0, 0);

        Roulette gMan = new Roulette();

        frame.getContentPane().add(gMan);
        frame.setVisible(true);
    }

    public void addRandomNumber() {

    }

    public void spinWheel() {
        theWheel.spin();
    }

    public int getWinnings() {
        int winnings = 0;

        return winnings;
    }

    public void setWheel(int val) {
        theWheel.setResult(val);
    }

    public ArrayList<Integer> getNumberBets() {
        return numberBets;
    }

    public void setBetAmounts(int amountOnOdd, int amountOnEven, int amountOn1stThird, int amountOn2ndThird, int amountOn3rdThird, ArrayList<Integer> numberBets) {
        this.amountOnOdd = amountOnOdd;
        this.amountOnEven = amountOnEven;
        this.amountOn1stThird = amountOn1stThird;
        this.amountOn2ndThird = amountOn2ndThird;
        this.amountOn3rdThird = amountOn3rdThird;
        this.numberBets = numberBets;
    }

    public void reset() {
        amountOnOdd = 0;
        amountOnEven = 0;
        amountOn1stThird = 0;
        amountOn2ndThird = 0;
        amountOn3rdThird = 0;
        numberBets = new ArrayList<Integer>();
    }

    public void actionPerformed(ActionEvent event) {

        String action = event.getActionCommand();

        if ("Bet Odd".equals(action)) {
            amountOnOdd += 1;
        } else if ("Bet Even".equals(action)) {
            amountOnEven += 1;
        } else if ("Bet 1st".equals(action)) {
            amountOn1stThird += 1;
        } else if ("Bet 2nd".equals(action)) {
            amountOn2ndThird += 1;
        } else if ("Bet 3rd".equals(action)) {
            amountOn3rdThird += 1;
        } else if ("Bet Random Number".equals(action)) {
            addRandomNumber();
        } else if ("Spin".equals(action)) {
            spinWheel();
        } else if ("Reset".equals(action)) {
            reset();
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New", Font.BOLD, 30));
        g.drawString(("Amount on Odd: " + amountOnOdd), 210, 35);
        g.drawString(("Amount on Even: " + amountOnEven), 210, 85);
        g.drawString(("Amount on 1st: " + amountOn1stThird), 210, 135);
        g.drawString(("Amount on 2nd: " + amountOn2ndThird), 210, 185);
        g.drawString(("Amount on 3rd: " + amountOn3rdThird), 210, 235);
        g.setFont(new Font("Courier New", Font.BOLD, 15));
        String numBets = "";
        int y = 260;
        for (Integer next : numberBets) {
            numBets = numBets + next + ", ";
            if (numBets.length() > 40) {
                g.drawString(numBets, 210, y);
                y += 25;
                numBets = "";
            }
        }
        g.drawString(numBets, 210, y);

        if (theWheel.getResult() != -1) {
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Courier New", Font.BOLD, 50));
            String winningsAmount = "$$ " + getWinnings() + " $$";
            String results = "Wheel Landed On: " + theWheel.getResult();
            g.drawString(results, 0, 450);
            g.drawString(winningsAmount, 0, 520);
        }
    }
}