package point2d;

//  Kell a "public" kulcsszó, mivel a default láthatóságban az osztályok csak adott package-ben láthatóak
//  így a pointm-ben lévő Main nem éri el a Point class-t "public" kulcsszú nélkül.
//  Az osztály metódusait is publikra kell tenni ilyenkor.
public class Point {
    public double x, y;

    public Point() {

    }

    public Point( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    public void move( double dx, double dy ) {
        x += dx;
        y += dy;
    }

    public void move( Point p ) {
        x += p.x;
        y += p.y;
    }

    public void mirror( double cx, double cy ) {
        x = 2 * cx - x;
        y = 2 * cy - y;
    }

    public double distance( Point p ) {
        double dx = p.x - this.x;
        double dy = p.y - this.y;
        return Math.sqrt( dx * dx + dy * dy );
    }
}