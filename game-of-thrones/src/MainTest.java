import org.junit.Test;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    org.junit.Assert.assertEquals("YES", Main.solve("aaabbbb"));
    org.junit.Assert.assertEquals("NO", Main.solve("cdefghmnopqrstuvw"));
    org.junit.Assert.assertEquals("YES", Main.solve("cdcdcdcdeeeef"));
  }
}
