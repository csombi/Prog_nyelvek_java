public abstract class Book {
  protected String author, title;
  protected int pageCount;

  public Book() {
    this.author = "John John";
    this.title = "Nice title";
    this.pageCount = 157;
  }

  public Book( String author, String title, int pagec ) {
    if( author.length() < 2 || title.length() < 4 ) throw new IllegalArgumentException();
    this.author = author;
    this.title = title;
    this.pageCount = pagec;
  }

  public String getShortName() {
    StringBuilder sb = new StringBuilder();
    sb.append(author.substring(0, 2)).append(title.substring(0, 4)).append(pageCount);
    return sb.toString();
  }

  public String toString() {
    return String.format("%s - %s (%d)", author, title, pageCount);
  }

  public abstract int getPrice();

  public abstract String createReference( String article, int startPage, int endPage );

  // public String createReference( String article, int startPage, int endPage ) {
  //   return String.format("%s [%d-%d] referenced in article: %s", getShortName(), startPage, endPage, article);
  // }
}
 
class PrintedBook extends Book {
  static enum CoverType { SoftCover, HardCover };

  private CoverType coverType;

  public PrintedBook() {
    super();  //  ősosztály konstruktora
    coverType = CoverType.HardCover;
  }

  public PrintedBook( String author, String title, int pagec, CoverType ct ) {
    super( author, title, pagec + 6);
    this.coverType = ct;
  }

  public int getPrice() {
    return coverType == CoverType.SoftCover ? pageCount * 2 : pageCount * 3;
  }

  public String createReference( String article, int startPage, int endPage ) {
    return String.format("%s [%d-%d] referenced in article: %s", super.toString(), startPage, endPage, article);
  }
}

class EBook extends Book {
  private int pdfSize; 

  public EBook(String author, String title, int pagec, int pdfSize ) {
    super( author, title, pagec );
    this.pdfSize = pdfSize;
  }

  public int getPrice() {
    return pdfSize + pageCount;
  }

  @Override   //  el is hagyhatnánk 
  public String toString() {
    return super.toString() + ", " + pdfSize + " kb";
  }

  public String createReference( String article, int startPage, int endPage ) {
    return String.format("%s (PDF size: %d) [%d-%d] referenced in article: %s", super.toString(), pdfSize, startPage, endPage, article);
  }

  public String createReference( String article, String date ) {
    return String.format("%s (PDF size: %d) referenced in article: %s, date: %s", super.toString(), pdfSize, article, date);
  }
}
