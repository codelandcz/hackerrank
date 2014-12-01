import java.io.*;
import java.util.ArrayList;

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
 * @see <a href="https://www.hackerrank.com/challenges/acm-icpc-team">ACM ICPC Team</a>
 */
public class Main
{
  static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
  static BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException
  {
    String[] definitions = in.readLine().split(" ");
    int N = Integer.parseInt(definitions[0]);

    ArrayList<String> attendants = new ArrayList<>(N);
    for (int i = 0; i < N; i++) {
      attendants.add(in.readLine());
    }
    out.write(solve(attendants));

    out.close();
  }

  public static String solve(ArrayList<String> attendants)
  {
    StringBuilder sb = new StringBuilder();
    int pairKnowledge;
    int maxKnowledge = 0;
    int teams = 0;

    for (int i = 0; i < attendants.size(); i++) {
      for (int j = i; j < attendants.size(); j++) {
        pairKnowledge = countPairKnowledge(attendants.get(i), attendants.get(j));

        if (pairKnowledge == maxKnowledge) teams++;
        else if (pairKnowledge > maxKnowledge) {
          maxKnowledge = pairKnowledge;
          teams = 1;
        }
      }
    }
    sb.append(maxKnowledge);
    sb.append("\n");
    sb.append(teams);

    return sb.toString();
  }

  private static int countPairKnowledge(String attendant1, String attendant2)
  {
    int count = 0;
    char[] att1 = attendant1.toCharArray();
    char[] att2 = attendant2.toCharArray();
    for (int i = 0; i < att1.length; i++) {
      count += (att1[i] - '0') | (att2[i] - '0');
    }

    return count;
  }
}