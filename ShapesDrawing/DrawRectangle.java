package ShapesDrawing;

/**
 * Class for drawing rectangles
 */
public class DrawRectangle {
    private Rectangle rectangle;

    /**
     * Constructor takes rectangle object from {@link Rectangle Rectangle} class
     *
     * @param rectangle object of the {@link Rectangle Rectangle} class
     */
    public DrawRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    /**
     * This method changes rectangle that we draw
     *
     * @param rectangle some new rectangle
     */
    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    /**
     * Draws rectangles at some coordinates according to its width and height using symbols
     * @param x is offset from left side
     * @param y is offset from the top
     */
    public void draw(int x, int y) {

        int width = rectangle.getWidth();
        int height = rectangle.getHeight();
        System.out.println("Drawing rectangle:");
        //y offset
        for (int l = 0; l < y; l++) {
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            boolean heightSide = i == 0 || i == height - 1;
            for (int j = 0; j < width; j++) {
                boolean widthSide = j == 0 || j == width - 1;
                // x offset
                if (j==0) {
                    for (int k = 0; k < x; k++) {
                        System.out.print("   ");
                    }
                }
                // drawing shape
                if (widthSide && heightSide) {
                    System.out.print("+");
                } else if (widthSide) {
                    System.out.print("|");
                } else if (heightSide) {
                    System.out.print("-—-");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
//last page in book is 422