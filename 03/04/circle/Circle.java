package circle;

import circle.utils.Point;

public class Circle {
  private Point center;
  private double radius;

  public Circle() {
    this.center = new Point(0, 0);
    this.radius = 1;
  }

  public Circle( double x, double y, double radius ) {
    this.center = new Point( x, y );
    this.setRadius( radius );
  }

  //  getters
  public double getRadius() {
    return radius;
  }

  public Point getCenter() { return center; }

  //  setters

  public void setRadius( double r ) {
    if( r > 0 ) this.radius = r;
    else throw new IllegalArgumentException();
  }

  public double getArea() {
    return Math.PI * Math.pow( radius, 2 );
  }

}

