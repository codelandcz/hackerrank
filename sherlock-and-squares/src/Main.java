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
 * @version 1.2
 * @see <a href="https://www.hackerrank.com/challenges/sherlock-and-squares">Sherlock and Squares</a>
 * @see <a href="http://stackoverflow.com/questions/295579/fastest-way-to-determine-if-an-integers-square-root-is-an-integer">SO</a>
 */
public class Main
{
  static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
  static BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

  static long goodMask; // 0xC840C04048404040 computed below

  static {
    for (int i = 0; i < 64; ++i) goodMask |= Long.MIN_VALUE >>> (i * i);
  }

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
    String[] boundaries = line.split(" ");
    long a = Long.parseLong(boundaries[0]);
    long b = Long.parseLong(boundaries[1]);

    long count = ((long) Math.sqrt(b)) - (long) (Math.ceil(Math.sqrt(a))) + 1;

    return Long.toString(count);
  }
}
