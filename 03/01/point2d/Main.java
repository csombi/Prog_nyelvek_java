package point2d;

public class Main {
  public static void main( String[] args ) {
      Point p = new Point();
      p.x = 2; 
      p.y = 3;
      System.out.println( "(" + p.x + ";" + p.y + ")" );
      p.move( 8, 7 );
      System.out.println( "(" + p.x + ";" + p.y + ")" );
      p.mirror( 0, 0);
      System.out.println( "(" + p.x + ";" + p.y + ")" );
      p.move( new Point(2, 3) );
      System.out.println( "(" + p.x + ";" + p.y + ")" );
      Point p1 = new Point( 1, 1 );
      Point p2 = new Point( 0, 0 );
      System.out.println( p1.distance( p2 ) );
  }
}
