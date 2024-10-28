package COW3;

import java.awt.*;

class Box {
    private int x;
    private int y;
    private Color theColor;
    private int width;
    private int height;
    private boolean isOn;

    public Box(int x, int y, Color theColor, int width, int height) {
        this.x = x;
        this.y = y;
        this.theColor = theColor;
        this.width = width;
        this.height = height;
        this.isOn = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return theColor;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void moveRight(int amount) {
        x += amount;
    }

    public void moveLeft(int amount) {
        x -= amount;
    }

    public void moveUp(int amount) {
        y -= amount;
    }

    public void moveDown(int amount) {
        y += amount;
    }

    public void moveTo(int nextX, int nextY) {
        x = nextX;
        y = nextY;
    }

    public void stretchRight(int amount) {
        width += amount;
    }

    public void stretchDown(int amount) {
        height += amount;
    }

    public void paint(Graphics g) {
        g.setColor(isOn ? theColor : Color.BLACK);
        g.fillRect(x, y, width, height);
    }

    public boolean equals(Box otherBox) {
        return this.width == otherBox.getWidth() && this.height == otherBox.getHeight();
    }

    public int compareTo(Box otherBox) {
        int thisArea = width * height;
        int otherArea = otherBox.getWidth() * otherBox.getHeight();
        return Integer.compare(thisArea, otherArea);
    }
}
