import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainTest
{
  @Test
  public void testSolve() throws Exception
  {
    BufferedReader in = new BufferedReader(new FileReader("filling-jars/src/input04.txt"));
    String[] definitions = in.readLine().split(" ");
    int N = Integer.parseInt(definitions[0]);
    int M = Integer.parseInt(definitions[1]);
    String[] lines = new String[M];

    for (int i = 0; i < M; i++) {
      lines[i] = in.readLine();
    }
    org.junit.Assert.assertEquals("4991588628", Main.solve(lines, N));
  }
}
