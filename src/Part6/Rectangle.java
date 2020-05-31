package Part6;

public class Rectangle {

    private int height;
    private int width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public int calculateArea() {
        return width * height;
    }
}
