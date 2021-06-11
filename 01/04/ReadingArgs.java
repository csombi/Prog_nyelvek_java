class ReadingArgs {
    public static void main( String[] args ) {
        if( args.length < 1 ) System.out.println( "Too few arguments!" );
        else {
            String str = "Hello, " + args[0] + "!";
            System.out.println( str );
        }
    }
}