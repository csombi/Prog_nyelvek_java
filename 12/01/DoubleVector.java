import java.util.Objects;

public class DoubleVector
{
    double[] coords;

    public DoubleVector(double x1, double x2)
    {
        this.coords = new double[2];
        this.coords[0] = x1;
        this.coords[1] = x2;
    }

    public String toString()
    {
        return "(" + this.coords[0] + "," + this.coords[1] + ")";
    }

    @Override
    public boolean equals( Object ob ) {
      if( this == ob ) return true;
      if( ob == null ) return false;
      if( getClass() != ob.getClass() ) return false;

      //  meg kell nézni, hogy a belső adattag megegyezik-e
      DoubleVector other = (DoubleVector)ob;
      return coords[0] == other.coords[0] && coords[1] == other.coords[1];
      //return this.coords.equals(other.coords);  //  már volt equlsa metódusa a double[]-nak, ezért csak meghívjuk
    }

    @Override
    public int hashCode() {
      return Objects.hash(coords[0], coords[1]);
    }
}