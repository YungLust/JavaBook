package ShapesDrawing;
/**
 * class that represents rectangles it has width and height
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * parameterless constructor is needed for children`s classes
     */
    public Rectangle() {}

    /**
     * default constructor to create rectangle
     * @param width rectangle`s width
     * @param height rectangle`s height
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * method that returns width
     * @return rectangle`s width
     */
    public int getWidth() {
        return width;
    }

    /**
     * method that returns height
     * @return rectangle`s height
     */
    public int getHeight() {
        return height;
    }

}
