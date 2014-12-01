import java.io.*;

/**
 * <h2>Introduction</h2>
 * <h2>Input</h2>
 * <h2>Constraints</h2>
 * <h2>Output</h2>
 * <h2>Example</h2>
 * <h2>Algorithm explanation</h2>
 *
 * @author codelandcz
 * @version 1.1
 * @see <a href="https://www.hackerrank.com/challenges/filling-jars">Filling Jars</a>
 */
public class Main
{
  static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
  static BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException
  {
    String[] definitions = in.readLine().split(" ");
    int N = Integer.parseInt(definitions[0]);
    int M = Integer.parseInt(definitions[1]);
    String[] lines = new String[M];

    for (int i = 0; i < M; i++) {
      lines[i] = in.readLine();
    }
    out.write(solve(lines, N));

    out.close();
  }

  public static String solve(String[] lines, int N)
  {
    long average = 0;
    for (String line : lines) {
      String[] tmp = line.split(" ");
      average += ((Long.parseLong(tmp[1]) - Long.parseLong(tmp[0])) + 1) * Long.parseLong(tmp[2]);
    }

    return Long.toString(average / N);
  }
}
