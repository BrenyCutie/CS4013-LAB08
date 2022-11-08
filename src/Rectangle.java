import java.awt.geom.Area;

public class Rectangle extends GeometricObject {
  private double width;
  private double height;

    /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Return height*/
  public double getHeight() {
    return height;
  }

  /**Set a new height*/
  public void setHeight(double height) {
    this.height = height;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*height;
  }

  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + height);
  }



  //Override the equals method in the Circle and Rectangle classes. Two circles are equal if their
  //radii are equal and two rectangles are equal if their widths and heights are equal. Use the
  //@Override annotation to indicate to the complier that your intention in each case is to
  //override a method in a superclass
  //public boolean equals(Object obj)
  @Override
  public boolean equals(Object obj) {
    if (this.width == ((Rectangle)obj).getWidth() && this.height == ((Rectangle)obj).getHeight()) {
      return true;
    } else {
      return false;
    }
  }

  // Override the toString method in the Circle and Rectangle classes. Use the @Override
  //annotation to indicate to the complier that your intention in each case is to override a
  //method in a superclass
  //public String toString()
  @Override
  public String toString() {
    return "Rectangle{" +
            "width=" + width +
            ", height=" + height +
            '}';
  }

  @Override
  public int compareTo(Area o) {
    return 0;
  }
}

