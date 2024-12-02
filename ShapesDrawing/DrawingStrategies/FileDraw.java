package ShapesDrawing.DrawingStrategies;

import ShapesDrawing.Rectangle;

import java.io.*;

public class FileDraw implements DrawingStrategy {
    private final String baseDir = System.getProperty("user.dir");
    private final String filePath = baseDir+"\\ShapesDrawing\\canvas.txt";
    private final File canvasFile = new File(filePath);

    public FileDraw(){
        try {
            System.out.println(canvasFile.createNewFile() ? "Creating canvas" : "Canvas is created already");
            System.out.println(filePath);
        }
        catch (IOException e){
            System.out.println("File error: "+e);
        }
    }

    public void draw(Rectangle rectangle, int x, int y) {

        //try with resources takes some IOstream to work with.
        try (FileOutputStream fout = new FileOutputStream(canvasFile, true)) {

            //initializing all needed variables
            OutputStreamWriter outWriter = new OutputStreamWriter(fout);
            StringBuilder strBuilder= new StringBuilder();

            //we build StringBuilder that will contain the representation of the rectangle
            int width = rectangle.getWidth();
            int height = rectangle.getHeight();
            Build(strBuilder, width, height, x, y);

            //we write the StringBuilder to file
            outWriter.write(strBuilder.toString());
            outWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found: " + e);
        } catch (IOException l) {
            System.out.println("File error : " + l);
        }
    }

    private void Build(StringBuilder builder, int width, int height, int x, int y) {
        //y offset
        builder.append("\n".repeat(Math.max(0, y))); // we use max to make sure so 'y' is not negative

        for (int i = 0; i < height; i++) {
            boolean heightSide = i == 0 || i == height - 1;
            for (int j = 0; j < width; j++) {
                boolean widthSide = j == 0 || j == width - 1;
                // x offset
                if (j == 0) {
                    for (int k = 0; k < x; k++) {
                        builder.append("   ");
                    }
                }
                // drawing shape
                if (widthSide && heightSide) {
                    builder.append("+");
                } else if (widthSide) {
                    builder.append("|");
                } else if (heightSide) {
                    builder.append("-—-");
                } else {
                    builder.append("   ");
                }
            }
            builder.append("\n");
        }
    }

    public void cleanCanvas(){
        System.out.println(canvasFile.delete() ? "Canvas cleaned" : "Canvas is in use.");
    }
}

//last page 435