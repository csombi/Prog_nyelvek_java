import java.io.IOException;
import java.io.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

public class Article {
  private String title, body, conclusion;
  private PrintWriter printer;
  private ArrayList<Book> refs;

  public Article( String title, String body, String conc ) {
    this.title = title;
    this.body = body;
    this.conclusion = conc;
    refs = new ArrayList<Book>();
  }

  public void addBooktoReferences( Book book ) {
    refs.add( book );
  }
  
  private void printBook( Book book ) {
    printer.println(book.createReference(title, 1, book.getPages() ));
  }

  public void print(String filename) {
    try {
      printer = new PrintWriter(new File(filename));
      printer.println(title);
      printer.println(body);
      printer.println(conclusion);
      for(Book book : refs ) printBook(book);
    } catch( IOException e ) {
      e.printStackTrace();
    } finally {
      printer.close();
    }
  }
}
