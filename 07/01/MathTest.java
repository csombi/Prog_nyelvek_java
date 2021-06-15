import org.junit.Test;

import jdk.jfr.Timestamp;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class MathTest {
  final double EPSILON = 0.001;

  @Test
  public void testExp() {
    assertEquals( 8, MathUtils.power(2, 3), EPSILON);
  }

  @Test
  public void test0Exp() {
    assertEquals( "2^0", 1, MathUtils.power(2, 0), EPSILON);
    assertEquals( "0^0", 1, MathUtils.power(0, 0), EPSILON);
  }

  @Test
  public void testNExp() {
    assertEquals( "2^-3", 0.125, MathUtils.power(2, -3), EPSILON);
  }
}
