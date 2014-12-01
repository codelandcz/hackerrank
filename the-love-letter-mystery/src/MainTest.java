import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/** User: Jirka */
public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    assertEquals("0", Main.solve("a"));
    assertEquals("1", Main.solve("ab"));
    assertEquals("3", Main.solve("da"));
    assertEquals("2", Main.solve("abc"));
    assertEquals("0", Main.solve("abcba"));
    assertEquals("4", Main.solve("abcd"));
  }
}
