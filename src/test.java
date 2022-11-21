import java.util.ArrayList;

public class test {
    //Write a test program that uses the max method to find the larger of two GeometricObjects.
    //These objects could be circles or rectangles.
    public static void main(String[] args) {
        GeometricObject uwu = new Circle(1);
        GeometricObject owo = new Rectangle(1, 1);

        System.out.println("Shape 1 : " + uwu);
        System.out.println("Shape 2 : " + owo);

        System.out.println(GeometricObject.max(owo, uwu));
        System.out.println(GeometricObject.max(uwu, owo));


        // Write a test program that creates an array of five GeometricObjects. For each object in the
        //array, invoke its howToColor method if it is Colorable.
        GeometricObject[] shapes = {new Rectangle(1,2), new square(1), new Circle(1), new square(1),new Circle(4)};

        for (GeometricObject p:shapes) {
            if(p instanceof Colorable){
                ((Colorable)p).howToColor();
            }
        }
    }


}
