class Point {
    double x, y;

    Point() {

    }

    Point( double x, double y ) {
        this.x = x;
        this.y = y;
    }

    void move( double dx, double dy ) {
        x += dx;
        y += dy;
    }

    void move( Point p ) {
        x += p.x;
        y += p.y;
    }

    void mirror( double cx, double cy ) {
        x = 2 * cx - x;
        y = 2 * cy - y;
    }

    double distance( Point p ) {
        double dx = p.x - this.x;
        double dy = p.y - this.y;
        return Math.sqrt( dx * dx + dy * dy );
    }
}

class Main {
    public static void main( String[] args ) {
        Point p = new Point();
        p.x = 2;
        p.y = 3;
        System.out.println( "(" + p.x + ";" + p.y + ")" );
        p.move( 8, 7 );
        System.out.println( "(" + p.x + ";" + p.y + ")" );
        p.mirror( 0, 0);
        System.out.println( "(" + p.x + ";" + p.y + ")" );
        p.move( new Point(2, 3) );
        System.out.println( "(" + p.x + ";" + p.y + ")" );
        Point p1 = new Point( 1, 1 );
        Point p2 = new Point( 0, 0 );
        System.out.println( p1.distance( p2 ) );
    }
}
