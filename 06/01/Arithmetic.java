public class Arithmetic {
    public static void main( String[] args ) {
        try {
            if( args.length == 3 ) {
                double n1 = Double.parseDouble( args[0] );
                char op = args[1].charAt(0);
                double n2 = Double.parseDouble( args[2] );

                switch(op) {
                    case '+':
                        System.out.println( n1 + n2 );
                        break;
                    case '-':
                        System.out.println( n1 - n2 );
                        break;
                    case '*':
                        System.out.println( n1 * n2 );
                        break;
                    case '/':
                        if( n2 != 0 ) System.out.println( n1 / n2 );
                        else throw new ArithmeticException( "Cannot div by zero." );
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } else throw new IllegalArgumentException();
        } catch( NumberFormatException e ) {            // ha ez ArithmeticEx után lenne, akkor hiba, mivel a NumberFormatEx az ArithmeticEx-ből van származtatva, így az már lekezeli
            System.out.println("Number format exc.");
        } catch( IllegalArgumentException e ) {
            System.out.println("Illegal arguments.");
        } catch ( ArithmeticException e ) {
            System.out.println(e.getMessage());
        } finally {
            //  mindig lefut a try-catch utasítások után

        }
    }
}
