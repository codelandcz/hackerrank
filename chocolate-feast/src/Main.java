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
    int totalChocolates = 0;
    int money = Integer.parseInt(inputs[0]);
    int price = Integer.parseInt(inputs[1]);
    int wrappers = Integer.parseInt(inputs[2]);
    int chocolates;
    int reminders;
    int extra;

    chocolates = money / price;
    reminders = chocolates % wrappers;
    extra = chocolates / wrappers;
    totalChocolates += chocolates + extra;

    while (extra + reminders >= wrappers) {
      chocolates = (extra + reminders) / wrappers;
      reminders = chocolates % wrappers;
      extra = chocolates / wrappers;
      totalChocolates += chocolates + extra;
    }

    return Integer.toString(totalChocolates);
  }
}
