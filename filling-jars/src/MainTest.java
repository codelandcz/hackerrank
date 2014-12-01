import org.junit.Test;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    int N = 5;
    String[] lines = {
      "1 2 100",
      "2 5 100",
      "3 4 100"
    };
    org.junit.Assert.assertEquals("160", Main.solve(lines, N));
  }
}
