public class Main {
  public static void main( String[] args ) {
    Circle c = new Circle();
    c.setX( 5 );
    c.setY( 2 );
    c.setRadius( 10 );
    System.out.println( c.getArea() );
    //c.setRadius( -1 );

    Circle c1 = new Circle( 5, 2, -1 );
  }
}
