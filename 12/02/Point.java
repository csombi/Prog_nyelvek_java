import java.util.Objects;

public class Point implements Comparable<Point> {
  private int x, y;

  public Point( int x, int y ) {
    this.x = x;
    this.y = y;
  }

  public Point() {
    this.x = 0;
    this.y = 0;
  }

  public int getX() { return x; }
  public int getY() { return y; }

  @Override
  public boolean equals( Object ob ) {
    if( this == ob ) return true;
    if( ob == null ) return false;
    if( getClass() != ob.getClass() ) return false;
    
    Point other = (Point) ob;
    return x == other.x && y == other.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y );
  }

  @Override
  public int compareTo( Point p ) {
    int result = Integer.compare( x, p.x );
    if( result == 0 ) return Integer.compare(y, p.y);
    return result;
  }

  @Override
  public String toString() {
    return String.format("(%d,%d)", x, y);
  }

}
