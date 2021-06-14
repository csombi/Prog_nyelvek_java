package point2d;

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