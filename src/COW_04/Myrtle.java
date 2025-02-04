package COW4;

import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Myrtle extends Turtle
{
    public Myrtle(JPanel world, Block [][] map, char direction, int row, int col, int fruitCount){
        super(world, map, direction, row, col, fruitCount);
    }

    public void move(int numSteps) {
        for (int i = 0; i < numSteps; i++) {
            move();
        }
    }

    public void moveToWall() {
        while (frontIsClear()) {
            move();
        }
    }

    public void moveToFruit() {
        while (frontIsClear() && !isNextToFruit()) {
            move();
        }
    }

    public void pickFruit(int numFruit) {
        for (int i = 0; i < numFruit; i++) {
            pickFruit();
        }
    }

    public void pickAllFruit() {
        while (isNextToFruit()) {
            pickFruit();
        }
    }

    public void placeRow(int numSteps) {
        for (int i = 0; i < numSteps; i++) {
            placeFruit();
            move();
        }
    }

    public void pickRow(int numSteps){
        
    }

    public void pickAllFruitToWall(){
        
    }

    public void placeGrid(int width, int height){
        
    }

    public void searchForFruit(){
        
    }

    public void harvestEverything(){
        
    }

    public void findFruitInMaze(){
        
    }

}
