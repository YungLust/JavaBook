package ShapesDrawing;
/**
 * In main class we create rectangles from different figures and draw them
 */

class Main{
    public static void main(String[] args){

        //initialize our figures
        RoundedRectangle roundedRect = new RoundedRectangle(4,8,25);
        Polygon polygon = new Polygon(3, 12);
        Rectangle rect = new Rectangle(12,6);

        //adapt if needed
        RectangleAdapter roundedAdapter = new RectangleAdapter(roundedRect);
        RectangleAdapter polygonAdapter = new RectangleAdapter(polygon);

        //draw figures
        DrawRectangle drawRect = new DrawRectangle(roundedAdapter);
        drawRect.draw(0,0);
        System.out.println("\n");
        drawRect.setRectangle(polygonAdapter);
        drawRect.draw(2,2);
        System.out.println("\n");
        drawRect.setRectangle(rect);
        drawRect.draw(8,4);

    }
}