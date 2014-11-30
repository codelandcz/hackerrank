import java.io.*;

/**
 * <h2>Introduction</h2>
 * <h2>Input</h2>
 * <h2>Output</h2>
 * <h2>Example</h2>
 * <h2>Algorithm explanation</h2>
 *
 * @author codelandcz
 * @version 1.0
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

  //TODO Comparison with iteration over chars
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
}