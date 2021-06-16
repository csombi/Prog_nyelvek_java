public class Main {
  public static void main( String[] args ){
    Book book = new PrintedBook();

    System.out.println(book.createReference("article", 0, 5));
    System.out.print(book.getShortName());
  }
}
