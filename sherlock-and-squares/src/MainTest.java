import org.junit.Test;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    org.junit.Assert.assertEquals("2", Main.solve("3 9"));
    org.junit.Assert.assertEquals("0", Main.solve("17 24"));
  }
}
