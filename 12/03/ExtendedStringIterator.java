import java.util.Iterator;

public class ExtendedStringIterator implements Iterator<Character> {
  private String str;
  private int ind;

  public ExtendedStringIterator( String str ) {
    this.str = str;
    this.ind = 0;
  }

  @Override
  public boolean hasNext() {
    return ind < str.length();
  }

  @Override
  public Character next() {
    return str.charAt(ind++);
  }

  @Override
  public void remove() {
    ind++;
  }
}
