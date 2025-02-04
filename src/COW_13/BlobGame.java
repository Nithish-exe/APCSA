import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;

public class BlobGame extends JPanel implements KeyListener
{
    Blob playerBlob;
    ArrayList<Blob> evilBlobs;
    int delay;
    boolean gameOver;

    public BlobGame(){
        gameOver  = false;
        delay = 100;
        evilBlobs = new ArrayList<Blob>();
        
        //create playerBlob
        
    }

    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
        char c;
        c = e.getKeyChar();


    }
    
    public void checkForCollision(){
        
    }
    
    public void createEvilBlob(){
        
        
    }

    public static int distance(int x1, int y1, int x2, int y2){
        return 0;
    }    
    
    ////////////////////////////////////////////////////////
    //Do not edit code below

    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 800, 800);
        playerBlob.draw(g);
        for(int i = 0; i < evilBlobs.size(); i++){
            evilBlobs.get(i).draw(g);
        }
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        char c;
        c = e.getKeyChar();
    }
    /** Handle the key typed event from the text field. */
    public void keyTyped(KeyEvent e) {
        char c;
        c = e.getKeyChar();     
    }
    
    public void run(){

        while(!gameOver){

            try {
                Thread.sleep(delay);
            }catch(InterruptedException e) {}
            
            playerBlob.move();
            for(int i = 0; i < evilBlobs.size(); i++){
                evilBlobs.get(i).move();    
            }
            
            //check for collision
            checkForCollision();
            
            paintImmediately(0, 0, 1000, 1000);
        }
        System.out.println("GAME OVER");
        System.out.println("Final Blob Size - " + playerBlob.getRadius());
    }
    
     public static void main(String [] arg){
        JFrame runner = new JFrame("Game Title");
        runner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        runner.setLocationRelativeTo(null);
        runner.setSize(800, 800);
        runner.setLayout(null);
        runner.setLocation(0, 0);
        
        BlobGame theGame = new BlobGame();
        theGame.setSize(800, 800);
        theGame.setLocation(0, 0);
        runner.getContentPane().add(theGame);
        
        runner.setVisible(true);

        runner.addKeyListener(theGame);
        theGame.run();
    }
}
