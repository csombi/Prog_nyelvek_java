public class Main {

  public enum Values {
    TRUE, FALSE, PERHAPS;
  }
  public static void main( String[] args ) {
    WildAnimal monkey = WildAnimal.Monkey;
    switch( monkey ) {
      case Monkey:
        System.out.println( "monkey" );
        break;
      case Raccoon:
        System.out.println( "raccoon" );
        break;
      default:
        break;
    }
    System.out.println(monkey.listAllAnimals() );

    Values k = Values.TRUE;
    switch( k ) {
      case TRUE:
        System.out.println("true");;
        break;
      case FALSE:
        System.out.println("false");
        break;
      default:
        System.out.println("perhaps");
        break;
    }
  }
}
