import java.io.*;

public class StringCalc {
  public static void main( String[] args ) throws IOException, FileNotFoundException {
    File f = new File( args[0] );
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);

    System.out.println("str: ");
    String str = System.console().readLine();

    int sum = 0;
    while( br.ready() ) {
      String line = br.readLine();
      boolean l = line.contains( str );
      if( l ) sum++;
    }

    System.out.println( sum );
  }
}
