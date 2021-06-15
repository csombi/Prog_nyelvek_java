import java.io.*;

//  alapvetőleg le kell kezelni az exceptionek, amiket a kód dobna egy try-catch-csel,
//  de mondhatjuk azt, hogy kezelje le az, aki meghívta a függvényt, így "tovább dobjuk" ~~> 1. kód
public class F {
  //  1
  /*
  public static void main( String[] args ) throws FileNotFoundException {
    File f = new File("in.txt");
    FileReader fr = new FileReader( f );
    BufferedReader br = new BufferedReader( fr );
  }
  */
  //  2
  public static void main( String[] args ) {
    try {
      File f = new File("in.txt");
      File of = new File("out.txt");
      FileReader fr = new FileReader( f );
      BufferedReader br = new BufferedReader( fr );
      PrintWriter pw = new PrintWriter(of);
      int sum = 0;
      while( br.ready() ) {
        String line = br.readLine();
        String[] s = line.split(",");
        for( String str : s ) sum += Integer.parseInt(str);
        System.out.println(sum);
        pw.println(sum);
      }
      pw.close();
      br.close();
    } catch( FileNotFoundException e ) {
      e.printStackTrace();
    } catch( IOException e) {
      e.printStackTrace();
    }
  }
}
