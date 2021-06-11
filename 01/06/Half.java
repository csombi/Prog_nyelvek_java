public class Half {
   public static void main( String[] args ) {
       System.out.println( "Enter the first number: ");
       int x = Integer.parseInt( System.console().readLine() );
       System.out.println( "Enter the second number: ");
       int y = Integer.parseInt( System.console().readLine() );
       for( int i = x; i < y; i++ ) System.out.println( i / 2.0 );
   }
}
