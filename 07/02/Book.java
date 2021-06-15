import java.nio.file.StandardCopyOption;

public class Book {
  enum Genre { FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL; }

  private String author;
  private String title;
  private int reserve_price;
  private int id;
  private Genre genre;

  private static int last_id = 0;

  private Book( String author, String title, Genre genre, int price ) {
    this.author = author;
    this.title = title;
    this.genre = genre;
    this.reserve_price = price;
    this.id = last_id++;
  }

  public static Book make( String author, String title, String sGenre, int price ) {
    if( author == null || title == null ) return null;
    if( author.length() < 2 || title.length() < 2 ) return null;
    /*
    for( char c : author.toCharArray() ) {
      if( !Character.isWhitespace(c) ||!Character.isDigit(c) || !Character.isLetter(c) ) return null;
    }
    for( char c : title.toCharArray() ) {
      if( !Character.isWhitespace(c) ||!Character.isDigit(c) || !Character.isLetter(c) ) return null;
    }*/
    int i = 0;
    while( i < title.length() ) {
      if( Character.isLetter(title.charAt(i)) || Character.isDigit(title.charAt(i)) || Character.isWhitespace(title.charAt(i))) {
        i++;
      } else {
        return null;
      }
    }
    if( price <= 0 ) return null;
    Genre genre;
    switch( sGenre ) {
      case "FANTASY":
        genre = Genre.FANTASY;
        break;
      case "SATIRE":
        genre = Genre.SATIRE;
        break;
      case "SCIFI":
        genre = Genre.SCIFI;
        break;
      case "PHILOSOPHY":
        genre = Genre.PHILOSOPHY;
        break;
      case "EDUCATIONAL":
        genre = Genre.EDUCATIONAL;
        break;
      default:
        return null;
    }


    return new Book(author, title, genre, price);
  }

  public static boolean isSameGenre( Book b1, Book b2 ) {
    if( b1 == null || b2 == null ) throw new IllegalArgumentException();
    return b1.genre == b2.genre;
  }

  public int compare( Book other ) {
    if( !isSameGenre(this, other) ) throw new IllegalArgumentException();

    return Integer.compare(this.reserve_price, other.reserve_price );
  }
}
