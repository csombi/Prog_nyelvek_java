import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main( String[] args ) {
    new Main();
  }

  public Main() {
    List<Integer> list = divisors( 100 );
    list.forEach((o) -> print(o));

    Box<String> box = new Box<String>("tea");
    System.out.println(box.get());

    ArrayList<String> strs = new ArrayList<>();
    strs.add("aaaa");
    strs.add("");
    strs.add("qwe");
    strs.add("magam");
    //strs = getStrSameBeginningAndEnding(strs);
    removeStrDiffBegAndEnd(strs);
    strs.forEach((o) -> print(o));

    //  3
    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 45, 65, 44, 23, 98, 2));
    minToFront(nums);
    System.out.println(nums  );
  }

  public void print(Object o) {
    System.out.println(o);
  }

  public LinkedList<Integer> divisors( int n ) {
    if( n <= 0 ) throw new IllegalArgumentException();

    LinkedList<Integer> result = new LinkedList<>();
    for( int i = 1; i < n / 2; i++ ) {
      if( n % i == 0 ) result.add( i );
    }
    return result;
  }

  //  2
  public ArrayList<String> getStrSameBeginningAndEnding( ArrayList<String> list ) {
    ArrayList<String> result = new ArrayList<>();
    for( String str : list ) {
      if( str.length() > 0 && str.charAt(0) == str.charAt(str.length() - 1) ) {
        result.add(str);
      }
    }

    return result;
  }

  public void removeStrDiffBegAndEnd( ArrayList<String> list ) {
    list.removeIf( s -> { return s.length() == 0 || s.charAt(0) == s.charAt(s.length() - 1); });
  }

  //  3
  public void minToFront( ArrayList<Integer> list ) {
    if( list.size() == 0 ) throw new IllegalArgumentException();
    Integer min = Collections.min(list);
    list.remove( min );
    list.add(0, min);
  }
}
