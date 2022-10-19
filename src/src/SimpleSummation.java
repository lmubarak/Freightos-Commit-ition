import java.util.Scanner;

/**
 * @author Laith Mubarak
 */
public class SimpleSummation {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while (t-- > 0) {
      String line = in.next();
      char delimiter = line.charAt(1);
      long result = getResult(line.substring(3), delimiter);
      System.out.println(result);
    }
  }

  public static long getResult(String line, char delimiter) {
    int lastIndex = 0;
    long result = 0;
    for (int i = 1; i < line.length(); i++) {
      if (line.charAt(i) == delimiter && line.charAt(i - 1) != delimiter) {
        result += Integer.parseInt(line.substring(lastIndex, i));
        lastIndex = i + 1;
      }
    }

    result += Integer.parseInt(line.substring(lastIndex));
    return result;
  }

}
