package COW_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ArrayContainer
{
    int [] theArray;

    public int[] getArray(){return theArray;}

    public void setArray(int[] theArray){this.theArray = theArray;}
    
    //Level 1 methods

    public void swap(int index1, int index2){
        
    }

    public int findIndexOfBiggest(){
        return 0;
    }

    public int findIndexOfSmallest(){
        return 0;
    }

    public void appendArray(int[] otherArray){
        
    }

    //Level 2 Methods

    public void reverse(){
        
    }

    public int findBiggestValue(){
        return 0;
    }

    public int findSmallestValue(){
        return 0;
    }

    public int findRangeOfValues(){
        return 0;
    }

    public void appendArrayAtFront(int[] otherArray){
        
    }

    //Level 3 Methods

    public void shiftLeft(){
        
    }

    public int findIndexOfBiggestInRangeOfIndexes(int index1, int index2){
        return 0;
    }

    public int findIndexOfSmallestInRangeOfIndexes(int index1, int index2){
        return 0;
    }

    public int[] getSubArray(int index1, int index2){
        return new int[0];
    }

    //Level 4 Methods

    public void shiftRight(){
        
    }

    public int findBiggestValueInRangeOfIndexes(int index1, int index2){
        return 0;
    }

    public int findSmallestValueInRangeOfIndexes(int index1, int index2){
        return 0;
    }

    public int findRangeOfValuesInRangeOfIndexes(int index1, int index2){
        return 0;
    }

    public void removeElements(int n){
        
    }

    public void removeElementsFromFront(int n){
        
    }

    //Level 5 Methods

    public void move(int index1, int index2){
        
    }

    public void swapLargestToFront(){
        
    }

    public void swapLargestToBack(){
        
    }

    public void removeElements(int index1, int index2){
        
    }

    //Level 6 Methods

    public void moveLargestToFront(){
        
    }

    public void moveLargestToBack(){
        
    }

    public int[] removeSubArray(int index1, int index2){
        return new int[0];
    }

    public void appendArrayAtIndex(int[] otherArray, int index){
        
    }

    ////////////////////////////////////////////////////////////////////////////////
    //DO NOT EDIT BELOW!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    private int markedIndex;
    private boolean indexMarked;

    ArrayContainer(){
        indexMarked = false;
        createArray();
    }

    public void createArray(){
        //create an array of integers of random size (range 1 to 30)
        int size = 10 + (int)(Math.random() * 30);
        theArray = new int[size];

        //assign a random value to each integer in the array (range 0 to 99)
        for(int i = 0; i < theArray.length; i++){
            theArray[i] = (int)(Math.random() * 100);
        }

    }
    
    public void setIndex(int n){
        markedIndex = n;
        indexMarked = true;
    }

    public void paintArray(Graphics g){
        if(theArray != null){
            int size;
            if(indexMarked){
                //System.out.println("Marking index");
                size = theArray[markedIndex];
                g.setColor(Color.darkGray);
                g.fillRect(8 + markedIndex * 23, 130 - size, 17 , size + 40);
                g.setColor(Color.ORANGE);
                g.drawRect(7 + markedIndex * 23, 129 - size, 19 , size + 41);
                indexMarked = false;
            }

            for(int index = 0; index < theArray.length; index ++){
                size = theArray[index];

                g.setColor(Color.RED);
                g.fillRect(10 + index * 23, 150 - size, 13 , size);

                String valueInString = ("" + size);
                g.setColor(Color.WHITE);
                g.drawString(valueInString, 10 + index * 23, 145 - size);

                valueInString = ("" + index);
                g.setColor(Color.GREEN);
                g.drawString(valueInString, 10 + index * 23, 162);
            }

        }
    }
}
