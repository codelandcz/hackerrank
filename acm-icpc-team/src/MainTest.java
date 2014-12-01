import org.junit.Test;

import java.util.ArrayList;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    ArrayList<String> attendants = new ArrayList<>();
    attendants.add("10101");
    attendants.add("11100");
    attendants.add("11010");
    attendants.add("00101");
    org.junit.Assert.assertEquals("5\n2", Main.solve(attendants));
  }
}
