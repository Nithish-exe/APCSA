import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;

public class Blob
{
    int radius;
    Color theColor;
    int x, y;
    int deltaX, deltaY;
    
    public Blob(int aRadius, Color aColor, int aX, int aY, int aDeltaX, int aDeltaY){
        //assign class variables
    }
    
    //returns the x coordinate of the blob
    public int getX(){
        
    }
    
    //returns the y coordinate of the blob
    public int getY(){

    }
    
    //returns the radius of the blob
    public int getRadius(){

    }
    
    //increases the size(radius) of the blob
    public void eat(){

    }
    
    //moves the blob on its current path
    public void move(){

    }
    
    //has the blob increase its velocity to the right
    public void moveRight(){

    }
    
    //has the blob increase its velocity to the left
    public void moveLeft(){

    }
    
    //has the blob increase its velocity up
    public void moveUp(){

    }
    
    //has the blob increase its velocity down
    public void moveDown(){

    }
    
    public void draw(Graphics g){
        g.setColor(theColor);
        g.fillOval(x-radius, y-radius, 2*radius+1, 2*radius+1);
    }
}
