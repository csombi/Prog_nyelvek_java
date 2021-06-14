package mass;

import mass.util.Point;

public class Main {
  public static void main( String[] args ) {
    Point[] points = new Point[3];
    for( int i = 0; i < 3; i++ ) {
      System.out.print( "x = " );
      double x = Double.parseDouble( System.console().readLine() );
      System.out.print( "y = " );
      double y = Double.parseDouble( System.console().readLine() );
      points[i] = new Point( x, y );
    }

    for( Point x : points ) System.out.println("Point: {" + x.getX() + ";" + x.getY() + "}" );

    System.out.println("====== toString() ======");
    for( Point p : points ) System.out.print( p );

    //  solve
    double cx = 0, cy = 0;
    for( Point x : points ) {
      cx += x.getX();
      cy += x.getY();
    }
    cx /= 3;
    cy /= 3;
    Point cog = new Point( cx, cy );
    System.out.println( "Center of gravity: {" + cog.getX() + ";" + cog.getY() + "}");

    //  02
    Point cog2 = Point.getCog( points );
    System.out.println( "Center of gravity: {" + cog2.getX() + ";" + cog2.getY() + "}");
  }
}
