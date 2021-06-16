import java.util.*;

public class Main {
  public static void main( String[] args ) {
    ArrayList<Point> list = new ArrayList<>();
    list.add( new Point(0,0) );
    list.add( new Point(4,0) );
    list.add( new Point(6,8) );
    list.add( new Point(6,8) );
    list.add( new Point(-5,2) );
    System.out.println( list.toString() );
    Collections.sort(list); //  amikor implementálva van a Comperable interface

    System.out.println( list.toString() );

    //  amikor nincs implementálva a Comperable interface
    Collections.sort(list, new Comperator<Point>() {
      @Override
      public int compare(Point p1, Point p2) {
        int result = Integer.compare( p1.getX(), p2.getX() );
        if( result == 0 ) return Integer.compare(p1.getY(), p2.getY());
        return result;
      }
    });
  }
}
