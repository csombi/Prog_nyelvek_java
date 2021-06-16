public class Main {
  public static void main( String[] args ) {
    MultiSet ms = new MultiSet();
    ms.put("Whopper");
    ms.put("BigMac");
    ms.put("BigMac");
    System.out.println(ms.getData());

    MultiSet ms2 = new MultiSet();
    ms2.put("BigMac");
    ms2.put("BigMac");
    ms2.put("Whopper");
    ms2.put("McChicken");
    ms2.put("BigMac");
    System.out.println(ms2.getData());
    
    System.out.println( ms.intersect(ms2).getData() );
  }
}
