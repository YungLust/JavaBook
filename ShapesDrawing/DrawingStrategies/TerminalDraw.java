package ShapesDrawing.DrawingStrategies;

import ShapesDrawing.Rectangle;

public class TerminalDraw implements DrawingStrategy {

    @Override
    public void draw(Rectangle rectangle, int x, int y) {
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
