//import java.awt.Dimension;

import javax.swing.*;
import java.awt.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;

public class Slot {
    private int randomNumber;
    private final String[] fileNames = {"question.jpg", "brain.jpg", "Strawberry.jpg", "he-man.jpg", "Tummi.jpg", "ThunderCats.jpg", "moon.jpg", "gizmo.jpg", "pony.jpg", "Fozzie.jpg"};
    private Image img;
    public Slot() {
        randomNumber = 0;
    }

    public void spin() {

    }

    public int getNumber() {
        return randomNumber;
    }

    public void setNumber(int number) {
        randomNumber = number;
    }

    public void paint(Graphics g, int x, int y) {
        img = (new ImageIcon(fileNames[randomNumber])).getImage();
        g.drawImage(img, x, y, null);
    }
}
