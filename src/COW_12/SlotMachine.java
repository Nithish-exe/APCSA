import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotMachine extends JPanel implements ActionListener {
    private final Button spinButton;
    private final Slot[] slots;
    private int amount;
    public SlotMachine() {
        setLayout(null);
        slots = new Slot[3];
        for (int i = 0; i < slots.length; i++) {
            slots[i] = new Slot();
        }

        spinButton = new Button("SPIN");
        spinButton.setBounds(0, 350, 600, 100);
        spinButton.setActionCommand("SPIN");
        add(spinButton);
        spinButton.addActionListener(this);
    }

    public static void main(String[] arg) {
        JFrame frame;

        frame = new JFrame("Slot Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(615, 600);
        frame.setLocation(0, 0);

        SlotMachine gMan = new SlotMachine();

        frame.getContentPane().add(gMan);
        frame.setVisible(true);
    }

    public void spinMachine() {

    }

    public int getWinnings() {
        return 0;
    }

    public int getSlot(int index) {
        return slots[index].getNumber();
    }

    public void setSlots(int one, int two, int three) {
        slots[0].setNumber(one);
        slots[1].setNumber(two);
        slots[2].setNumber(three);
    }

    public void actionPerformed(ActionEvent event) {

        String action = event.getActionCommand();

        if ("SPIN".equals(action)) {
            spinMachine();
            amount = getWinnings();
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New", Font.BOLD, 60));
        for (int i = 0; i < slots.length; i++) {
            slots[i].paint(g, i * 200, 0);
            g.setColor(Color.WHITE);
            String value = "" + slots[i].getNumber();
            g.drawString(value, i * 200 + 90, 345);
        }
        g.setColor(Color.BLACK);
        g.drawLine(200, 0, 200, 300);
        g.drawLine(400, 0, 400, 300);
        g.setColor(Color.YELLOW);
        String winnings = "$$ " + amount + " $$";
        g.drawString(winnings, 150, 500);
    }
}
