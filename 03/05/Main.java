import stringutils.IterLetter;

public class Main {
  public static void main( String[] args ) {
    IterLetter it = new IterLetter( "Kleo" );
    while( it.hasNext() ) it.printNext();

    it.restart();
    it.printNext();
  }
}
