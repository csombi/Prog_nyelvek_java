import java.util.Iterator;

public class ExtendedString implements Comparable<ExtendedString>, Iterable<Character> {
  private String str;

  public ExtendedString( String str ) {
    this.str = str;
  }

  public ExtendedString() {
    str = null;
  }

  public String getStr() {
    return str;
  }

  @Override
  public int compareTo( ExtendedString e ) {
    int l1 = str == null ? 0 : str.length();
    int l2;
    if( e == null ) l2 = 0;
    else if ( e.str == null ) l2 = 0;
    else l2 = e.str.length();

    return Integer.compare(l1, l2);
  }

  @Override
  public String toString() {
    if( str == null ) return "null";
    else return str;
  }

  @Override
  public Iterator<Character> iterator() {
    return new ExtendedStringIterator(str);
  }
}
