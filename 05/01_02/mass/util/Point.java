package mass.util;

/*
* @author csombi
* @version 1.0
* @since 1.0
*/
public class Point {
  static private int idCount = 0; 
  private int id;
  private double x, y;

  public Point() {
    idCount++;
    this.id = idCount;
    this.x = 0;
    this.y = 0;
  }

  /*
  * @param x The x coordinate
  * @param y The y coordinate
  */
  public Point( double x, double y ) {
    idCount++;
    this.id = idCount;
    this.x = x;
    this.y = y;
  }

  public Point( Point p ) {
    if( p == null ) throw new NullPointerException();
    else {
      idCount++;
      this.id = idCount;
      this.x = p.getX();
      this.y = p.getY();
    }
  }

  //  getters
  /*
  * @return Return the x coordinate
  */
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

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ID: " + this.id + "~~>\t");
    sb.append("{" + this.x + ";" + this.y + "}\n");
    return sb.toString();
  }
}
