public class Arithmetic {
    public static void main( String[] args ) {
        int a, b;
        if( args.length < 2 ) {
            System.out.println( "Enter the first number: " );
            a = Integer.parseInt( System.console().readLine() );
            System.out.println( "Enter the second number: " );
            b = Integer.parseInt( System.console().readLine() );
        } else {
            a = Integer.parseInt( args[0] );
            b = Integer.parseInt( args[1] );
        }

        System.out.print( "The sum of a and b: ");
        System.out.println( a + b );

        System.out.print( "The difference of a and b: ");
        System.out.println( a - b );

        System.out.print( "The product of a and b: ");
        System.out.println( a * b );

        if( b == 0 ) System.out.println( "Not divisable." );
        else {
            System.out.print( "The quotient of a and b: " );
            System.out.println( a / b );
            System.out.print( "Remains: " );
            System.out.println( a % b );
        }
    }
}
