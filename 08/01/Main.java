public class Main {
  public static void main( String[] args ) {
    Book book = new PrintedBook();
    Book book2 = new EBook("Ara", "Jojo", 123, 321);
    System.out.println( book.getShortName() );
    System.out.println( book2.getShortName() );
    System.out.println( ((PrintedBook)book).getPrice() );
    System.out.println( ((EBook)book2).getPrice() );

    PrintedBook pb = new PrintedBook();
    EBook eb = new EBook("Atu", "Titl", 134, 333);
    System.out.println(pb);
    System.out.println(eb);

    System.out.println(pb.createReference("Cikk", 5, 12));
    System.out.println(eb.createReference("EBCikk", 2, 14));

    Book b = new Book();
    System.out.println(b.createReference("CikkB", 3, 9));
  }
}
