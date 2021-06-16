import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main( String[] args ) {
    Bag<Integer> b = new Bag<>();
    b.add(1);
    b.add(1);
    b.add(1);
    b.add(4);
    b.add(2);
    System.out.println(b);

    try {
      b.remove(1);
    } catch( NotInBagException e) {
      e.printStackTrace();
    }
    
    System.out.println(b);

    //  02 feladat
    Bag<String> bag = new Bag<>();
    try(BufferedReader br = new BufferedReader( new FileReader( new File("input.txt")))) {
      while( br.ready() ) bag.add(br.readLine());
      System.out.println(bag);
    } catch ( FileNotFoundException e ) {
      e.printStackTrace();
    } catch( IOException e ) {
      e.printStackTrace();
    }

    //  03
    String[] ts = {"Jeno", "jojo", "Monday", "Alma"};
    swap(ts, 0, 2);
    System.out.println(Arrays.toString(ts));
  }

  static <T> void swap( T array[], int ind1, int ind2 ) {
    T temp = array[ind1];
    array[ind1] = array[ind2];
    array[ind2] = temp;
  }
}
