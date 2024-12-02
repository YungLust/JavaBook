package ShapesDrawing;

import ShapesDrawing.DrawingStrategies.*;
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

        // initialize strategies
        FileDraw fileStrat = new FileDraw();
        TerminalDraw terminalStrat = new TerminalDraw();

        // using TerminalDraw strat
        DrawRectangle drawRect = new DrawRectangle(rect,terminalStrat);
        drawRect.draw(2,2);

        //using FileDraw strat
        drawRect.setStrategy(fileStrat);
        fileStrat.cleanCanvas();
        drawRect.draw(0,0);
        drawRect.draw(2,1);



    }
}