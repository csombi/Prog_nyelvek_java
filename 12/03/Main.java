import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
  public static void main( String[] args ) {
    ArrayList<ExtendedString> list = new ArrayList<>();
    list.add( new ExtendedString() );
    list.add( new ExtendedString("3") );
    list.add( new ExtendedString("asd") );
    list.add( new ExtendedString("kasd") );
    list.add( new ExtendedString("batsd") );

    System.out.println( list.toString() );

    Collections.sort( list );

    System.out.println( list.toString() );

    ExtendedString es = new ExtendedString("toltottkaposzta");

    Iterator<Character> it = es.iterator();

    while( it.hasNext() ) {
      char ch = it.next();
      System.out.print( ch +  "," );
    }
    System.out.println();

    it = es.iterator();

    System.out.println(it.next());
    it.remove();
    System.out.println(it.next());
  }
}
