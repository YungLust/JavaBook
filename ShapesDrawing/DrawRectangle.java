package ShapesDrawing;

/**
 * Class for drawing rectangles
 */
public class DrawRectangle {
    private Rectangle rectangle;

    /**
     * Constructor takes rectangle object from {@link Rectangle Rectangle} class
     * @param rectangle object of the {@link Rectangle Rectangle} class
     */
    public DrawRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    /**
     * This method changes rectangle that we draw
     * @param rectangle some new rectangle
     */
    public void setRectangle(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    /**
     * Draws rectangles according to its width and height using symbols
     */
    public void draw() {

        int width = rectangle.getWidth();
        int height = rectangle.getHeight();
        System.out.println("Drawing rectangle:");
        for (int i = 0; i < height; i++) {
            boolean heightSide = i == 0 || i == height - 1;
            for (int j = 0; j < width; j++) {
                boolean widthSide = j == 0 || j == width - 1;
                if (widthSide && heightSide) {
                    System.out.print("+");
                }
                else if (widthSide){
                    System.out.print("|");
                }
                else if(heightSide){
                    System.out.print("-—-");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
//last page in book is 422