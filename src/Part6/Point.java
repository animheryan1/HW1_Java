package Part6;

public class Point {

    private int coordinateX;
    private int coordinateY;

    Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double distance() {
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(coordinateX - point.getCoordinateX(), 2) + Math.pow(coordinateY - point.getCoordinateY(), 2));
    }
}
