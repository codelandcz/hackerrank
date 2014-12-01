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
 * @version 1.0
 * @see <a href="https://www.hackerrank.com/challenges/the-love-letter-mystery">The Love-Letter Mystery</a>
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
    char left;
    char right;
    char[] chars = line.toCharArray();

    for (int i = 0; i < chars.length && i < chars.length - i; i++) {
      left = chars[i];
      right = chars[chars.length - 1 - i];
      count += Math.abs(left - right);
    }

    return Integer.toString(count);
  }
}
