//Note the Colorable interface is provided in the source code. Design a class named Square
//that extends GeometricObject and implements Colorable.

import java.awt.geom.Area;

public class square extends GeometricObject implements Colorable {

    private double width;

    public square(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }


    //Implement howToColor() to display the message Colour all four sides.
    @Override
    public void howToColor() {
        System.out.println("Colour all four sides.");
    }


    @Override
    public int compareTo(Area o) {
        return 0;
    }
}
