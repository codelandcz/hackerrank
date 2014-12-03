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
 * @see <a href="https://www.hackerrank.com/challenges/sherlock-and-squares">Sherlock and Squares</a>
 * @see <a href="http://stackoverflow.com/questions/295579/fastest-way-to-determine-if-an-integers-square-root-is-an-integer">SO</a>
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
    String[] boundaries = line.split(" ");

    for (long i = Long.parseLong(boundaries[0]); i <= Long.parseLong(boundaries[1]); i++) {
      if (isSquare(i)) count++;
    }

    return Integer.toString(count);
  }

  public static boolean isSquare(long n)
  {
    long tst = (long) Math.sqrt(n);
    return tst * tst == n;
  }
}
