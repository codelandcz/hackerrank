import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    List<String> lines = new ArrayList<>();
    List<String> results = new ArrayList<>();
    lines.add("0");
    lines.add("1");
    lines.add("2");
    lines.add("3");
    lines.add("4");
    lines.add("5");
    lines.add("6");
    lines.add("7");
    results.add("1");
    results.add("2");
    results.add("3");
    results.add("6");
    results.add("7");
    results.add("14");
    results.add("15");
    results.add("30");

    for (int i = 0; i < lines.size(); i++) {
      assertEquals(results.get(i), Main.solve(lines.get(i)));
    }

  }
}
