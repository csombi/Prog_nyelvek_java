public class Factorial {
    public static void main( String[] args ) {
        System.out.print( "Enter a number: " );
        int n = Integer.parseInt( System.console().readLine() );

        int s = 1;
        while( n > 1 ) {
            s = s * n;
            n--;
        }
        System.out.println( "The factorial is: " + s );
    }
}
