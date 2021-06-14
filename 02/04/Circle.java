public class Circle {
   double x, y, r;
   
   Circle( double x, double y, double r ) {
       this.x = x;
       this.y = y;
       this.r = r;
   }

   void enlarge( double f ) {
       r *= f;
   }

   double getArea() {
       return Math.PI * radius * radius;
   }
}
