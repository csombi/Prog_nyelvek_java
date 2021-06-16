import javax.sound.sampled.ReverbType;

public class Main {
  public static void main(String[] args ) {
    ReversablePoint point = new ReversablePoint(3, 5);
    Object ob = (Object)point;

    point.setX(10);

    if( ob instanceof Reversable ){
      Reversable p = (Reversable)ob;
      p.reverse();
    }

    System.out.println(ob.toString());
  }
}
