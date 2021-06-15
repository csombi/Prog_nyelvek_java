import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
  public static void main( String[] args ) {
    Circle c = new Circle( 2, 3, 5 );
    Circle d = new Circle();
    try {
      c.saveToFile("circle.txt");
      d = Circle.readFromFile("circle.txt");
    } catch( FileNotFoundException e ) {
      e.printStackTrace();
    } catch( IOException e ) {
      e.printStackTrace();
    }

    if( d != null ) System.out.println( c.equals(d) );
  }  
}
