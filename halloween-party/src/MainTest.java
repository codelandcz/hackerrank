import org.junit.Test;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    org.junit.Assert.assertEquals("6", Main.solve("5"));
    org.junit.Assert.assertEquals("9", Main.solve("6"));
    org.junit.Assert.assertEquals("12", Main.solve("7"));
  }
}
