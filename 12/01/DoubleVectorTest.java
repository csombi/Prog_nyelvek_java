import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DoubleVectorTest {
  @Test
  public void testEqualsReflexive() {
    DoubleVector dv = new DoubleVector(0, 0);
    assertEquals(dv, dv);
  }

  @Test
  public void testEqualsSymmetric() {
    DoubleVector dv1 = new DoubleVector(0, 0);
    DoubleVector dv2 = new DoubleVector(0, 0);
    DoubleVector dv3 = new DoubleVector(1, 0);
    assertEquals(dv1, dv2);
    assertEquals(dv2, dv1);
    assertNotEquals(dv1, dv3);
    assertNotEquals(dv2, dv3);
  }

  @Test
  public void testEqualsTransitive() {
    DoubleVector dv1 = new DoubleVector(0, 0);
    DoubleVector dv2 = new DoubleVector(0, 0);
    DoubleVector dv3 = new DoubleVector(0, 0);
    assertEquals(dv1, dv2);
    assertEquals(dv2, dv3);
    assertEquals(dv1, dv3);
  }

  @Test
  public void testHashCode() {
    DoubleVector dv1 = new DoubleVector(0, 0);
    DoubleVector dv2 = new DoubleVector(1, 0);
    assertTrue( dv1.hashCode() == dv1.hashCode() );
    assertTrue( dv1.hashCode() != dv2.hashCode() );

    int hs = dv1.hashCode();
    dv1.coords[0] = 4;
    assertTrue( hs != dv1.hashCode() );
  }
}
