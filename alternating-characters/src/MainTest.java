import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/** User: Jirka */
public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    assertEquals("0", Main.solve("A"));
    assertEquals("3", Main.solve("AAAA"));
    assertEquals("4", Main.solve("BBBBB"));
    assertEquals("0", Main.solve("ABABABAB"));
    assertEquals("0", Main.solve("BABABA"));
    assertEquals("4", Main.solve("AAABBB"));
  }
}
