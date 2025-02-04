package COW3;

import java.awt.*;

class Point {
    private int x;
    private int y;
    private Color theColor;
    private int radius;

    public Point(int x, int y, Color theColor, int radius) {
        this.x = x;
        this.y = y;
        this.theColor = theColor;
        this.radius = radius;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public Color getColor() { return theColor; }
    public int getRadius() { return radius; }

    public void moveRight(int amount) { x += amount; }
    public void moveLeft(int amount) { x -= amount; }
    public void moveUp(int amount) { y -= amount; }
    public void moveDown(int amount) { y += amount; }
    public void moveTo(int nextX, int nextY) { x = nextX; y = nextY; }

    public void paint(Graphics g) {
        g.setColor(theColor);
        g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    public boolean equals(Point otherPoint) {
        return this.x == otherPoint.getX() && this.y == otherPoint.getY();
    }

    public int compareTo(Point otherPoint) {
        double thisDistance = Math.sqrt(x * x + y * y);
        double otherDistance = Math.sqrt(otherPoint.getX() * otherPoint.getX() + otherPoint.getY() * otherPoint.getY());
        return Double.compare(thisDistance, otherDistance);
    }
}
