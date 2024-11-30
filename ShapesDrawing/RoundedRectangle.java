package ShapesDrawing;
/**
 * class that represents rectangles with rounded corners
 * it has width and height and corner radius
 */
public class RoundedRectangle {
    private int width;
    private int height;
    private int cornerRadius;

    /**
     * default constructor to create rounded rectangle
     * @param width rounded rectangle width
     * @param height rounded rectangle height
     * @param cornerRadius rounded rectangle corner radius
     */
    public RoundedRectangle(int width, int height, int cornerRadius) {
        this.width = width;
        this.height = height;
        this.cornerRadius = cornerRadius;
    }


    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }
}
