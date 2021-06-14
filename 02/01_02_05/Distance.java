import java.awt.Point;

public class Distance {
   public static void main( String[] args ) {
       double l = 0;
       for( int i = 0; i < args.length - 2; i += 2 ) {
           int x1 = Integer.parseInt( args[i] );
           int y1 = Integer.parseInt( args[i + 1] );
           Point p1 = new Point(x1 ,y1);
           int x2 = Integer.parseInt( args[i + 2] );
           int y2 = Integer.parseInt( args[i + 3] );
           Point p2 = new Point(x2 ,y2);

           double dist = p1.distance( p2 );
           l += dist;
       }

       System.out.println( "Distance: " + l );
   } 
}
