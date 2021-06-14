public class Point {
  private double x, y;

  public Point() {
    this.x = 0;
    this.y = 0;
  }

  public Point( double x, double y ) {
    this.x = x;
    this.y = y;
  }

  public Point( Point p ) {
    if( p == null ) throw new NullPointerException();
    else {
      this.x = p.getX();
      this.y = p.getY();
    }
  }

  //  getters
  public double getX() { return x; }
  public double getY() { return y; }
   
  //  setters
  public void setX( double x ) { this.x = x; }
  public void setY( double y ) { this.y = y; }


  public static Point getCog( Point[] points ) {
    double cx = 0, cy = 0;
    for( Point p : points ) {
      cx += p.getX();
      cy += p.getY();
    }
    return new Point( cx / points.length , cy / points.length );
  }
}
