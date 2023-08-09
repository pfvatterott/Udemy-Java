package Section7.Point;

public class Point {
    
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        double distance = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        return Math.sqrt(distance);
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }
}
