import org.junit.Test;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    org.junit.Assert.assertEquals("6", Main.solve("10 2 5"));
    org.junit.Assert.assertEquals("3", Main.solve("12 4 4"));
    org.junit.Assert.assertEquals("5", Main.solve("6 2 2"));
    org.junit.Assert.assertEquals("899", Main.solve("43203 60 5"));
  }
}
