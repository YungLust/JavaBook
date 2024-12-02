package ShapesDrawing;

import ShapesDrawing.DrawingStrategies.DrawingStrategy;

import java.io.FileOutputStream;

/**
 * Class for drawing rectangles
 */
public class DrawRectangle {
    private Rectangle rectangle;
    private DrawingStrategy strategy;

    /**
     * Constructor takes rectangle object from {@link Rectangle Rectangle} class
     *
     * @param rectangle object of the {@link Rectangle Rectangle} class
     */
    public DrawRectangle(Rectangle rectangle, DrawingStrategy strategy) {
        this.rectangle = rectangle;
        this.strategy = strategy;
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
     * This method changes strategy of drawing
     *
     * @param strategy is another strategy
     */
    public void setStrategy(DrawingStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Draws rectangles at some coordinates according to its width and height using symbols
     * @param x is offset from left side
     * @param y is offset from the top
     */
    public void draw(int x, int y) {
        strategy.draw(rectangle, x, y);
    }
}
