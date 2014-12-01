import java.io.*;
import java.util.HashMap;
import java.util.Map;

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
 * @see <a href="http://stackoverflow.com/a/20544902">http://stackoverflow.com/a/20544902</a>
 * @see <a href="https://www.hackerrank.com/challenges/game-of-thrones">Game of Thrones - I</a>
 */
public class Main
{
  static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
  static BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException
  {
    out.write(solve(in.readLine()));
    out.newLine();

    out.close();
  }

  public static String solve(String line)
  {
    int odds = 0;
    Map<Character, Integer> map = new HashMap<>();

    for (char x : line.toCharArray())
      if (map.get(x) == null) map.put(x, 1);
      else map.put(x, map.get(x) + 1);

    for (Integer integer : map.values())
      if (integer % 2 == 1) odds++;

    return (odds > 1) ? "NO" : "YES";
  }
}
