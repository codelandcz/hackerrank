import java.io.*;

/**
 * <h2>Introduction</h2>
 * The Utopian tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. The second growth cycle occurs during the summer, when its height increases by 1 meter.
 * Now, a new Utopian tree sapling is planted at the onset of the spring. Its height is 1 meter. Can you find the height of the tree after N growth cycles?
 * <h2>Input</h2>
 * The first line contains an integer, T, the number of test cases.
 * T lines follow. Each line contains an integer, N, that denotes the number of cycles for that test case.
 * <h2>Constraints</h2>
 * 1 &lt;= T &lt;= 10
 * 0 &lt;= N &lt;= 60
 * <h2>Output</h2>
 * For each test case, print the height of the Utopian tree after N cycles.
 * <h2>Example</h2>
 * Sample Input #00:
 * 2
 * 0
 * 1
 * Sample Output #00:
 * 1
 * 2
 * Sample Input: #01:
 * 2
 * 3
 * 4
 * Sample Output: #01:
 * 6
 * 7
 * Explanation: #01:
 * There are 2 testcases.
 * N = 3:
 * the height of the tree at the end of the 1st cycle = 2
 * the height of the tree at the end of the 2nd cycle = 3
 * the height of the tree at the end of the 3rd cycle = 6
 * N = 4:
 * the height of the tree at the end of the 4th cycle = 7
 * <h2>Algorithm explanation</h2>
 * <pre>
 * x=1, N=5;i=3,j=2
 * (((x*2+1)*2+1)*2
 * (((x*2+1)*4+2
 * (((x*8+4)+2
 * </pre>
 * <pre>
 * x = 1, N=6;i+j, i=3,j=3
 * (((x*2+1)*2+1)*2+1)
 * (((x*2+1)*4+2)+1)
 * (((x*8+4)+2)+1)
 * </pre>
 * <pre>
 *   2^i+2^i-1 even
 *   2^i+2^i-2 odd
 * </pre>
 *
 * @author codelandcz
 * @version 1.1
 * @see <a href="https://www.hackerrank.com/challenges/utopian-tree">Utopian Tree</a>
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
    int height;
    int x;
    int i;

    x = Integer.parseInt(line);

    if (x == 0) return "1";
    if (x == 1) return "2";
    i = x / 2;
    i += x % 2;
    height = (int) Math.pow(2, i) + (int) Math.pow(2, i) - 1 - (x % 2);

    return Integer.toString(height);
  }
}
