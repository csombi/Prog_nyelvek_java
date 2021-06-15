public class MathUtils {
  public static double power( int b, int e ) {
    double result = 1;
    for( int i = 0; i < Math.abs(e); i++ ) {
      result *= b;
    }

    if( e < 0 ) result = 1.0 / result;
    
    return result;
  }
}
