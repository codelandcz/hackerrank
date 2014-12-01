import java.io.*;

/**
 * <h2>Introduction</h2>
 * <h2>Input</h2>
 * The first line contains an integer T i.e. the number of test cases. Next T lines contain a string each.
 * <h2>Constraints</h2>
 * <h2>Output</h2>
 * Print minimum number of required steps for each test case.
 * <h2>Example</h2>
 * <h2>Algorithm explanation</h2>
 *
 * @author codelandcz
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/alternating-characters">Alternating Characters</a>
 */
public class Main
{
  static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
  static BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException
  {
    int T = Integer.parseInt(in.readLine());

    for (int i = 0; i < T; i++) {
      out.write(solve(in.readLine()));
      out.newLine();
    }

    out.close();
  }

  public static String solve(String line)
  {
    int count = 0;
    char lastChar = line.charAt(0);
    for (int i = 1; i < line.length(); i++) {
      if (lastChar == line.charAt(i)) {
        count++;
      }
      else {
        lastChar = line.charAt(i);
      }
    }

    return Integer.toString(count);
  }
}
