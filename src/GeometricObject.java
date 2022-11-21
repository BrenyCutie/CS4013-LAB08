import java.awt.geom.Area;

public abstract class GeometricObject implements Comparable<Area> {
    protected String color;
    protected double weight;
    protected double area;

    // Default construct
    protected GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    // Construct a geometric object
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method for weight
    public double getWeight() {
        return weight;
    }

    // Setter method for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Abstract method
    public abstract double getArea();

    // Abstract method
    public abstract double getPerimeter();


    //Modify the GeometricObject class to implement the Comparable interface (Compare
    //GeometricObjects based on their area). Thus GeometricObject should implement:
    //public int compareTo(GeometricObject o)
    public int compareTo(GeometricObject o) {
        double res = getArea() - o.getArea();
        if (res == 0) {
            return 0;
        } else if (res > 0) {
            return 1;
        } else {
            return -1;
        }
    }


    //Define a static max method in the GeometricObject class for finding the larger of two
    //Geometric Objects. In this method use the compareTo method to determine the larger of
    //the two objects.
    //public static GeometricObject max (GeometricObject o1, GeometricObject o2)
    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) == 1){
            return o1;
        } else {
            return o2;
        }

    }
}
