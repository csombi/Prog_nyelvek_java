public class Main {
  public static void main( String[] args ) {
    PrintedBook pb1 = new PrintedBook();
    EBook eb1 = new EBook("Auth", "Titl", 231, 1231);
    Book bk = new Book("Gordon", "Sauce", 23);

    Article art = new Article("Cult","asdasdqesad", "conclusion");
    art.addBooktoReferences(pb1);
    art.addBooktoReferences(eb1);
    art.addBooktoReferences(bk);

    art.print("out.txt");
  }
}
