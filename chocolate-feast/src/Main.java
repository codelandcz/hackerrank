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
 * @version 1.1
 * @see <a href="https://www.hackerrank.com/challenges/chocolate-feast">Chocolate Feast</a>
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
    String[] inputs = line.split(" ");
    int money = Integer.parseInt(inputs[0]);
    int price = Integer.parseInt(inputs[1]);
    int exchange = Integer.parseInt(inputs[2]);

    int totalChocolates = 0;

    int wrappers = money / price;
    int reminders = 0;
    int tmp = wrappers + reminders;

    while (tmp >= exchange) {
      totalChocolates += wrappers;
      wrappers = tmp / exchange;
      reminders = tmp % exchange;

      tmp = wrappers + reminders;
    }
    totalChocolates += wrappers;

    return Integer.toString(totalChocolates);
  }
}
