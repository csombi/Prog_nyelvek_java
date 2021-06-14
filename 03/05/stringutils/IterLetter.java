package stringutils;

public class IterLetter {
  private String str;
  int index;

  public IterLetter( String s ) {
    if( s == null ) throw new IllegalArgumentException();
    str = new String( s );
    index = 0;
  }

  public void printNext() {
    if( hasNext() ) {
      System.out.println( str.charAt( index ) );
      index++;
    }
  }

  public void restart() {
    index = 0;
  }

  public boolean hasNext() {
    return index < str.length();
  }
}
