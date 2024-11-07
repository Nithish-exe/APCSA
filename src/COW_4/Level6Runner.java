package COW4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Level6Runner extends JPanel implements ActionListener, MouseListener, KeyListener
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

    public Level6Runner(JFrame theFrame){

        setLayout(null);
        blockSize = 30;
        mapLoaded = false;

        test1Button = new Button("Test Harvest Everything");
        test1Button.setBounds(0, 0, 200, blockSize);
        test1Button.setBackground(Color.WHITE);
        test1Button.setActionCommand("Test Harvest Everything");
        add(test1Button);
        test1Button.addActionListener(this);

        test2Button = new Button("Test Find Fruit In Maze");
        test2Button.setBounds(200, 0, 200, blockSize);
        test2Button.setBackground(Color.WHITE);
        test2Button.setActionCommand("Test Find Fruit In Maze");
        add(test2Button);
        test2Button.addActionListener(this);
        map = new Block[0][0];

        backgroundColor = Color.WHITE;
        name = "";
        gameOver = false;
        this.theFrame = theFrame;

    }

    public void actionPerformed (ActionEvent event)
    {
        String command = event.getActionCommand();
        //System.out.println("Command: " + command);
        if(command.equals("Test Harvest Everything")){

            generateRandomSizeMap();
            for(int r = 1; r < map.length-1; r++){
                for(int c = 1; c < map[0].length-1; c++){
                    int fruitAmount = (int)(Math.random() * 10);
                    map[r][c] = new Block(false, null, fruitAmount);
                }
            }

            repaint();
            paintImmediately(0,0,1000,1000);
            theFrame.requestFocus();
            theMyrtles = new ArrayList<Myrtle>();
            Myrtle next = new Myrtle(this, map, 'E', map.length-2, 1, 0);
            map[map.length-2][1] = new Block(false, next, 0);
            theMyrtles.add(next);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).harvestEverything();
            }
        }else if(command.equals("Test Find Fruit In Maze")){
            String [] stringMap = {"XXXXXXXXXXXXXX",
                    "XOOX1XOOOOOXOX",
                    "XXOXOXXXOXXXOX",
                    "XOOOOXXOOOOOOX",
                    "XOXXXXXOXXOXXX",
                    "XOXOXOOOXOOXOX",
                    "XOXOXXXOXXOOOX",
                    "XOOOOOOOXOOXOX",
                    "XXXXXXXXXXXXOX",
                    "XXOOOOXXXOOOOX",
                    "XOOXXOOOOOXXXX",
                    "XXOXXXXXXXXOOX",
                    "XOOOXOOOOOXXOX",
                    "XOXOOOXNXOOOOX",
                    "XXXXXXXXXXXXXX",};
            loadMap(stringMap);
            for(int i = 0; i < theMyrtles.size(); i++){
                //System.out.println("Moving next myrtle");
                theMyrtles.get(i).findFruitInMaze();
            }

        }

        repaint();

        paintImmediately(0,0,1000,1000);
        theFrame.requestFocus();

    }

    public void generateRandomSizeMap(){
        int rows = 5 + (int)(Math.random() * 15);
        int cols  = 5 + (int)(Math.random() * 15);

        map = new Block[rows][cols];
        for(int r = 0; r < map.length; r++){
            for(int c = 0; c < map[0].length; c++){
                map[r][c] = new Block(false, null, 0);
            }
        }
        for(int r = 0; r < map.length; r++){
            map[r][0] = new Block(true, null, 0);
            map[r][map[r].length-1] = new Block(true, null, 0);
        }
        for(int c = 0; c < map[0].length; c++){
            map[0][c] = new Block(true, null, 0);
            map[map.length-1][c] = new Block(true, null, 0);
        }
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

        for(int r = 0; r < map.length; r++){
            for(int c = 0; c < map[r].length; c++){
                map[r][c].paint(g, c*blockSize, r*blockSize + blockSize, blockSize);
                g.setColor(Color.BLACK);
                g.drawRect(c* blockSize, r*blockSize + blockSize, blockSize, blockSize);
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
        Level6Runner game = new Level6Runner(frame);
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
