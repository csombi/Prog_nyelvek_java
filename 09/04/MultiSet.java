import java.util.HashMap;

public class MultiSet {
  private HashMap<String, Integer> data;

  public MultiSet() {
    data = new HashMap<>();
  }

  public MultiSet( HashMap<String, Integer> map ) {
    data = new HashMap<>(map);
  }

  public HashMap<String, Integer> getData() {
    return new HashMap<>(data);
  }

  public void put( String s ) {
    if( data.containsKey(s) ) {
      data.replace(s, data.get(s) + 1 );
    } else {
      data.put(s, 1);
    }
  }

  public MultiSet intersect( MultiSet other ) {
    MultiSet result = new MultiSet();
    for( String key : data.keySet() ) {
      if( other.data.keySet().contains(key)) {
        result.data.put(key, Integer.min(data.get(key), other.data.get(key)));
      } 
    }
    return result;
  }
}
