package COW3;

import java.awt.*;

class Line {
    private Point endPoint1;
    private Point endPoint2;

    public Line(Point endPoint1, Point endPoint2) {
        this.endPoint1 = endPoint1;
        this.endPoint2 = endPoint2;
    }

    public Point getEndpoint1() { return endPoint1; }
    public Point getEndpoint2() { return endPoint2; }

    public double getDistance() {
        int dx = endPoint2.getX() - endPoint1.getX();
        int dy = endPoint2.getY() - endPoint1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getMidPoint() {
        int midX = (endPoint1.getX() + endPoint2.getX()) / 2;
        int midY = (endPoint1.getY() + endPoint2.getY()) / 2;
        return new Point(midX, midY, endPoint1.getColor(), endPoint1.getRadius());
    }

    public void moveRight(int amount) {
        endPoint1.moveRight(amount);
        endPoint2.moveRight(amount);
    }

    public void moveLeft(int amount) {
        endPoint1.moveLeft(amount);
        endPoint2.moveLeft(amount);
    }

    public void moveUp(int amount) {
        endPoint1.moveUp(amount);
        endPoint2.moveUp(amount);
    }

    public void moveDown(int amount) {
        endPoint1.moveDown(amount);
        endPoint2.moveDown(amount);
    }

    public boolean equals(Line otherLine) {
        return (this.endPoint1.equals(otherLine.getEndpoint1()) && this.endPoint2.equals(otherLine.getEndpoint2())) ||
                (this.endPoint1.equals(otherLine.getEndpoint2()) && this.endPoint2.equals(otherLine.getEndpoint1()));
    }

    public int compareTo(Line otherLine) {
        return Double.compare(this.getDistance(), otherLine.getDistance());
    }

    public void paint(Graphics g) {
        endPoint1.paint(g);
        endPoint2.paint(g);
        g.setColor(Color.BLACK);
        g.drawLine(endPoint1.getX(), endPoint1.getY(), endPoint2.getX(), endPoint2.getY());
    }
}
