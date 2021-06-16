import java.util.HashMap;

public class Bag<T> {
  private HashMap<T, Integer> data;

  public Bag() {
    data = new HashMap<>();
  }

  public void add( T elem ) {
    if( data.containsKey(elem) ) {
      data.replace(elem, data.get(elem) + 1);
    } else {
      data.put(elem, 1);
    }
  }

  public int countOf( T elem ) {
    if( data.containsKey(elem)) return data.get(elem);
    else return 0;
  }

  public void remove( T elem ) throws NotInBagException {
    if( data.containsKey(elem) ) {
      if( data.get(elem) == 1 ) {
        data.remove(elem);
      } else {
        data.replace(elem, data.get(elem) - 1);
      }
    } else throw new NotInBagException("Not in bag: " + elem );
  }

  public String toString() {
    return data.toString();
  }

  //  minta metódus paraméterzésére
  public <K, T> public void m( K p1, T p2 ) {
    //  ...
  }
}

