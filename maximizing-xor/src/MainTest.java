import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/** User: Jirka */
public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
      assertEquals("7", Main.solve(1,1));
      assertEquals("7", Main.solve(10,15));
      assertEquals("15", Main.solve(1,10));
  }
}
