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
    int count = 0;
    String[] boundaries = line.split(" ");

    for (long i = Long.parseLong(boundaries[0]); i <= Long.parseLong(boundaries[1]); i++) {
      if (isSquare(i)) count++;
    }

    return Integer.toString(count);
  }

  public static boolean isSquare(long x)
  {
    // This tests if the 6 least significant bits are right.
    // Moving the to be tested bit to the highest position saves us masking.
    if (goodMask << x >= 0) return false;
    final int numberOfTrailingZeros = Long.numberOfTrailingZeros(x);
    // Each square ends with an even number of zeros.
    if ((numberOfTrailingZeros & 1) != 0) return false;
    x >>= numberOfTrailingZeros;
    // Now x is either 0 or odd.
    // In binary each odd square ends with 001.
    // Postpone the sign test until now; handle zero in the branch.
    if ((x & 7) != 1 | x <= 0) return x == 0;
    // Do it in the classical way.
    // The correctness is not trivial as the conversion from long to double is lossy!
    final long tst = (long) Math.sqrt(x);
    return tst * tst == x;
  }
}
