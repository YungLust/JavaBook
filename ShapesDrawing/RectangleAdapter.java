package ShapesDrawing;
/**
 * Class to present other figures as rectangles
 */
public class RectangleAdapter extends Rectangle {
    private int width;
    private int height;
    private RoundedRectangle roundedRectangle;
    private Polygon polygon;

    /**
     * Overloading constructor that converts roundedRectangle to rectangle
     * It is achieved by setting corner radius to 0
     *
     * @param roundedRectangle figure to present as rectangle
     */
    public RectangleAdapter(RoundedRectangle roundedRectangle) {
        this.roundedRectangle = roundedRectangle;

        //rounded rectangle is a rectangle when it has 0 corner radius
        roundedRectangle.setCornerRadius(0);

        width = roundedRectangle.getWidth();
        height = roundedRectangle.getHeight();
    }

    /**
     * Overloading constructor that converts polygon to rectangle
     * It is achieved by setting sides to 4 and getting width and height from radius by formula
     *
     * @param polygon figure to present as rectangle
     */
    public RectangleAdapter(Polygon polygon) {
        this.polygon = polygon;

        //polygon is a square when it has 4 sides
        polygon.setSides(4);

        /*
         * radius is distance from center of polygon to its points
         * in our occasion it`s a half of the square`s diagonal
         * so to get square`s side we need to multiply radius by sqrt(2)
         */
        int sqrSide = (int) (polygon.getRadius() * Math.sqrt(2));
        width = sqrSide;
        height = sqrSide;

    }

    /**
     * we need to override the method from super class
     * so it works properly in {@link DrawRectangle DrawRectangle} class
     *
     * @return it returns width
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * we need to override the method from super class
     * so it works properly in {@link DrawRectangle DrawRectangle} class
     *
     * @return it returns height
     */
    @Override
    public int getHeight() {
        return height;
    }
}

