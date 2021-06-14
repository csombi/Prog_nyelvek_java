public class Circle {
  private double x, y, radius;

  public Circle() {
    this.x = 0;
    this.y = 0;
    this.radius = 1;
  }

  public Circle( double x, double y, double radius ) {
    this.x = x;
    this.y = y;
    this.setRadius( radius );
  }

  //  getters
  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getRadius() {
    return radius;
  }

  //  setters
  public void setX( double x ) {
    this.x = x;
  }

  public void setY( double y ) {
    this.y = y;
  }

  public void setRadius( double r ) {
    if( r > 0 ) this.radius = r;
    else throw new IllegalArgumentException();
  }

  public double getArea() {
    return Math.PI * Math.pow( radius, 2 );
  }

}
