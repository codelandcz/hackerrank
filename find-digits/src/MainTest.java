public class MainTest
{
  @org.junit.Test
  public void testSolve() throws Exception
  {
    org.junit.Assert.assertEquals("failure - strings are not equal", "2", Main.solve("24"));
    org.junit.Assert.assertEquals("failure - strings are not equal", "3", Main.solve("122"));
  }
}
