import java.io.*;

/**
 * <h2>Introduction</h2>
 * Given two integers: L and R, find the maximal values of A xor B given, L ≤ A ≤ B ≤ R
 * <h2>Input</h2>
 * The input contains two lines, L is present in the first line. R in the second line.
 * <h2>Constraints</h2>
 * 1 ≤ L ≤ R ≤ 10^3
 * <h2>Output</h2>
 * The maximal value as mentioned in the problem statement.
 * <h2>Example</h2>
 * <pre>
 * Sample Input#00
 * 1
 * 10
 * Sample Output#00
 * 15
 * Sample Input#01
 * 10
 * 15
 * Sample Output#01
 * 7
 * </pre>
 * <h2>Algorithm explanation</h2>
 *
 * @author codelandcz
 * @version 1.1
 * @see <a href="https://www.hackerrank.com/challenges/maximizing-xor">Maximizing XOR</a>
 */
public class Main
{
  static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
  static BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException
  {
    int x = Integer.parseInt(in.readLine());
    int y = Integer.parseInt(in.readLine());

    out.write(solve(x, y));
    out.newLine();

    out.close();
  }

  public static String solve(int x, int y)
  {
    int maxXor = Integer.MIN_VALUE;
    for (int i = x; i <= y; i++) {
      for (int j = i; j <= y; j++) {
        maxXor = Math.max(maxXor, i ^ j);
      }
    }

    return Integer.toString(maxXor);
  }
}
