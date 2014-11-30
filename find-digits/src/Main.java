import java.io.*;

/**
 * <h2>Introduction</h2>
 * <h2>Input</h2>
 * <h2>Output</h2>
 * <h2>Example</h2>
 * <h2>Algorithm explanation</h2>
 * Solve2 runs slower than Solve (0.1s vs 0.09s).
 *
 * @author codelandcz
 * @version 2.0
 * @see <a href="https://www.hackerrank.com/challenges/find-digits">Find Digits</a>
 */
public class Main
{
  static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
  static BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException
  {
    int N = Integer.parseInt(in.readLine());

    for (int i = 0; i < N; i++) {
      out.write(solve(in.readLine()));
      out.newLine();
    }

    out.close();
  }

  public static String solve(String line)
  {
    int count = 0;
    int x;
    int num;
    int divider;

    num = x = Integer.parseInt(line);
    for (int i = 0; i < line.length(); i++) {
      divider = x % 10;
      if (divider > 0 && num % divider == 0) {
        count++;
      }
      x /= 10;
    }

    return Integer.toString(count);
  }

  public static String solve2(String line)
  {
    int count = 0;
    int x;
    int num;

    num = Integer.parseInt(line);
    for (int i = 0; i < line.length(); i++) {
      x = Character.getNumericValue(line.charAt(i));
      if (x > 0 && num % x == 0) {
        count++;
      }
    }

    return Integer.toString(count);
  }
}