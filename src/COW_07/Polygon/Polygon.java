package COW_7.Polygon;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Polygon{
    Point [] thePoints;
    private Color theColor;

    public Polygon(Point[] thePoints, Color theColor) {
        this.thePoints = thePoints;
        this.theColor = theColor;
    }

    public Point[] getPoints() {
        return thePoints;
    }

    public void paint(Graphics g) {
        for (int i = 0; i < thePoints.length; i++) {
            Point start = thePoints[i];
            Point end = thePoints[(i + 1) % thePoints.length];
            g.drawLine((int) start.getX(), (int) start.getY(), (int) end.getX(), (int) end.getY());
        }
    }

    public void moveRight(int amount) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setX(thePoints[i].getX() + amount);
        }
    }

    public void moveLeft(int amount) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setX(thePoints[i].getX() - amount);
        }
    }

    public void moveUp(int amount) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setY(thePoints[i].getY() - amount);
        }
    }

    public void moveDown(int amount) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setY(thePoints[i].getY() + amount);
        }
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 0; i < thePoints.length; i++) {
            Point start = thePoints[i];
            Point end = thePoints[(i + 1) % thePoints.length];
            perimeter += start.distanceTo(end);
        }
        return perimeter;
    }

    public void reflectAcrossX(int x) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setX(2 * x - thePoints[i].getX());
        }
    }

    public void reflectAcrossY(int y) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setY(2 * y - thePoints[i].getY());
        }
    }

    public void reflectAcrossYequalX() {
        for (int i = 0; i < thePoints.length; i++) {
            double temp = thePoints[i].getX();
            thePoints[i].setX(thePoints[i].getY());
            thePoints[i].setY(temp);
        }
    }

    public void stretchHorizontally(double multiplier) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setX(thePoints[i].getX() * multiplier);
        }
    }

    public void stretchVertically(double multiplier) {
        for (int i = 0; i < thePoints.length; i++) {
            thePoints[i].setY(thePoints[i].getY() * multiplier);
        }
    }

    public void dilate(int x, int y, double multiplier) {
        for (int i = 0; i < thePoints.length; i++) {
            double newX = x + (thePoints[i].getX() - x) * multiplier;
            double newY = y + (thePoints[i].getY() - y) * multiplier;
            thePoints[i].setX(newX);
            thePoints[i].setY(newY);
        }
    }

    public void rotate(int x, int y, double angle){


    }
}