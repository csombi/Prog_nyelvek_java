import java.io.*;

public class Circle {
  private double x, y, r;

  public Circle() {
    this.x = 0;
    this.y = 0;
    this.r = 1;
  }

  public Circle( double x, double y, double radius ) {
    this.x = x;
    this.y = y;
    this.setRadius( radius );
  }

  public boolean equals( Circle c ) {
    return this.x == c.x && this.y == c.y && this.r == c.r;
  }

  //  getters
  public double getRadius() {
    return r;
  }


  //  setters

  public void setRadius( double r ) {
    if( r > 0 ) this.r = r;
    else throw new IllegalArgumentException();
  }

  public double getArea() {
    return Math.PI * Math.pow( r, 2 );
  }

  public static Circle readFromFile( String filename ) throws FileNotFoundException, IOException {
    BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
    double x = Double.parseDouble(br.readLine());
    double y = Double.parseDouble(br.readLine());
    double r = Double.parseDouble(br.readLine());

    br.close();

    return new Circle(x, y, r);
  }

  public void saveToFile( String filename ) throws FileNotFoundException {
    PrintWriter pw = new PrintWriter(new File(filename));
    pw.println(this.x);
    pw.println(this.y);
    pw.println(this.r);

    pw.close();
  }
}

