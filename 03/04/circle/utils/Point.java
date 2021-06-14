package circle.utils;

//  Kell a "public" kulcsszó, mivel a default láthatóságban az osztályok csak adott package-ben láthatóak
//  így a pointm-ben lévő Main nem éri el a Point class-t "public" kulcsszú nélkül.
//  Az osztály metódusait is publikra kell tenni ilyenkor.
public class Point {
    private double x, y;

    public Point() {
      this.x = 0;
      this.y = 0;
    }

    public Point( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    //  getters
    public double getX() { return x; }
    public double getY() { return y; }
   
    //  setters
    public void setX( double x ) { this.x = x; }
    public void setY( double y ) { this.y = y; }
}