package COW4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Level3Runner extends JPanel implements ActionListener, MouseListener, KeyListener
{
    private JFrame theFrame;
    private Button test1Button, test2Button, test3Button;
    private Color backgroundColor;
    private String name;
    private boolean gameOver;
    private Block [][] map;
    private int blockSize;
    private boolean mapLoaded;
    private ArrayList<Myrtle> theMyrtles;

    public Level3Runner(JFrame theFrame){

        setLayout(null);
        blockSize = 30;
        mapLoaded = false;

        test1Button = new Button("Test Pick All Fruit");
        test1Button.setBounds(0, 0, 200, blockSize);
        test1Button.setBackground(Color.WHITE);
        test1Button.setActionCommand("Test Pick All Fruit");
        add(test1Button);
        test1Button.addActionListener(this);

        test2Button = new Button("Test Place Row");
        test2Button.setBounds(200, 0, 200, blockSize);
        test2Button.setBackground(Color.WHITE);
        test2Button.setActionCommand("Test Place Row");
        add(test2Button);
        test2Button.addActionListener(this);

        backgroundColor = Color.WHITE;
        name = "";
        gameOver = false;
        this.theFrame = theFrame;

    }

    public void actionPerformed (ActionEvent event)
    {
        String command = event.getActionCommand();
        //System.out.println("Command: " + command);
        if(command.equals("Test Pick All Fruit")){
            String [] stringMap = {"XXXXXXXX",
                    "XOEOOOOX",
                    "XOEOOOOX",
                    "XOEOOOOX",
                    "XOEOOOOX",
                    "XXXXXXXX",};
            loadMap(stringMap);
            int [] fruitCount = new int[4];
            for(int i = 0; i < fruitCount.length; i++){
                int nextAmount = 1 + (int)(Math.random() * 9);
                fruitCount[i] = nextAmount;
                for(int n = 1; n <= nextAmount; n++){
                    map[i+1][3].addFruit();
                }
            }
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).move();
                theMyrtles.get(i).pickAllFruit();
                theMyrtles.get(i).move();
            }
        }else if(command.equals("Test Place Row")){
            String [] stringMap = {"XXXXXXXXXXXXXX",
                    "X2EOOOOOOOOOOX",
                    "X4EOOOOOOOOOOX",
                    "X8EOOOOOOOOOOX",
                    "X9EOOOOOOOOOOX",
                    "XXXXXXXXXXXXXX",};
            loadMap(stringMap);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).placeRow(map[i+1][1].getFruitCount());
            }
        }

        repaint();
        paintImmediately(0,0,1000,1000);
        theFrame.requestFocus();

    }

    public void loadMap(String [] stringMap){
        map = new Block[stringMap.length][];
        theMyrtles = new ArrayList<Myrtle>();

        for(int r = 0; r < map.length; r++){
            map[r] = new Block[stringMap[r].length()];
            for(int c = 0; c < map[r].length; c++){
                if(stringMap[r].charAt(c) == 'X'){
                    map[r][c] = new Block(true, null, 0);
                }else if(stringMap[r].charAt(c) == 'O'){
                    map[r][c] = new Block(false, null, 0);
                }else if(stringMap[r].charAt(c) == 'N' || stringMap[r].charAt(c) == 'S' || stringMap[r].charAt(c) == 'E' || stringMap[r].charAt(c) == 'W'){
                    Myrtle next = new Myrtle(this, map, stringMap[r].charAt(c), r, c, 0);
                    map[r][c] = new Block(false, next, 0);
                    theMyrtles.add(next);
                }else if(stringMap[r].charAt(c) >= '0' && stringMap[r].charAt(c) <= '9'){
                    String fruitAmount = "" + stringMap[r].charAt(c);
                    map[r][c] = new Block(false, null, Integer.parseInt(fruitAmount));
                }else{
                    map[r][c] = new Block(false, null, 0);
                }
            }
        }
        mapLoaded = true;
        paintImmediately(0,0,1000,1000);
    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("pressed: " + c);
        if(c == 'y' || c == 'Y'){
            backgroundColor = Color.YELLOW;
        }
        repaint();
        paintImmediately(0,0,1000,1000);
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("typed: " + c);

        repaint();    
    }

    public void keyReleased(KeyEvent e) {
        char c = e.getKeyChar();
        System.out.println("released: " + c);
        backgroundColor = Color.WHITE;
        repaint();
    }

    public void mouseClicked(MouseEvent e){
    }

    public void mouseEntered(MouseEvent e){
    }

    public void mouseExited(MouseEvent e){
    }

    public void mousePressed(MouseEvent e){
    }

    public void mouseReleased(MouseEvent e){
        int x = e.getX() - 4;
        int y = e.getY() - 30;
        System.out.println("X: " + x + '\t' + "Y: " + y);

    }

    ////////////////////////////////////////////////////
    //Title:    paint
    //Input:    Graphics object
    //Returns:  nothing
    //Does:     Paints the board to the screen
    public void paint(Graphics g){
        ((Graphics2D)g).setStroke(new BasicStroke(2));

        g.setColor(backgroundColor);
        g.fillRect(0, 0, 1000, 1000);

        // String message = "Hello " + name;

        // g.setFont(new Font("Times New Roman", Font.BOLD, 50));
        // g.setColor(Color.BLACK);
        // g.drawString(message, 300, 75);

        if(mapLoaded){
            for(int r = 0; r < map.length; r++){
                for(int c = 0; c < map[r].length; c++){
                    map[r][c].paint(g, c*blockSize, r*blockSize + blockSize, blockSize);
                    g.setColor(Color.BLACK);
                    g.drawRect(c* blockSize, r*blockSize + blockSize, blockSize, blockSize);
                }
            }
        }
    }

    public void run(){
        int delay = 100;
        while(!gameOver){

            System.out.println("Game Running");

            try {
                Thread.sleep(delay);
            }
            catch(InterruptedException e){

            }

            paintImmediately(0,0,1000,1000);
        }
    }

    public static void main(String [] arg){
        JFrame frame = new JFrame("Game");
        Level3Runner game = new Level3Runner(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(814, 800);
        frame.setLocation(0, 0);
        frame.addKeyListener(game);
        frame.addMouseListener(game);
        frame.getContentPane().add(game);
        frame.setVisible(true);
        frame.requestFocus();
        //game.run();

    }
}

