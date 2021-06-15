import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BookTest {
  @Test
  public void testMake() {
    assertNotNull( Book.make("Jani", "Kaposzta", "SCIFI", 6));
  }

  @Test
  public void testNullMake() {
    assertNull( Book.make(null, "Kaposzta", "SCIFI", 6));
    assertNull( Book.make("Jani", null, "SCIFI", 6));
    assertNull( Book.make("Jani", "Kaposzta", "SCIFI", -6));
  }

  @Test
  public void testCompare() {
    Book b1 = Book.make( "Jani", "Kaposzta", "SCIFI", 6);
    Book b2 = Book.make( "Jeno", "Paradicsom", "SCIFI", 6);
    Book b3 = Book.make( "Jeno", "Paradicsom", "SCIFI", 5);
    assertEquals( 0, b1.compare(b2));
    assertTrue( b1.compare(b3) > 0);
  }
}
