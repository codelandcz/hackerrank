import org.junit.Test;

import java.util.ArrayList;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    ArrayList<Attendant> attendants = new ArrayList<>();
    attendants.add(new Attendant("10101"));
    attendants.add(new Attendant("11100"));
    attendants.add(new Attendant("11010"));
    attendants.add(new Attendant("00101"));
    org.junit.Assert.assertEquals("5\n2", Main.solve(attendants));
  }
}
