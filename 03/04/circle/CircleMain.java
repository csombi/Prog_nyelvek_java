package circle;

public class CircleMain {
  public static void main( String[] args ) {
    Circle circ = new Circle( 5, 2, 10 );
    System.out.println( circ.getArea() );
    System.out.println( circ.getCenter().getX() );
  }
}
