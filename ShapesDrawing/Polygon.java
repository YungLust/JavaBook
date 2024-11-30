package ShapesDrawing;
/**
 * class that represents polygons it has radius and sides
 */
public class Polygon {

    /**
     * radius is a distance from the center of polygon to its points
     */
    private int radius;

    /**
     * sides is the number of points
     */
    private int sides;

    /**
     * default constructor to create polygon
     * @param radius radius is a distance from the center of polygon to its points
     * @param sides sides is the number of points
     */
    public Polygon(int radius, int sides) {
        this.radius = radius;
        this.sides = sides;
    }

    public int getRadius() {
        return radius;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
