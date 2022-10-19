import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * @author Laith Mubarak
 */
public class Paragraph {

  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    printParagraph(n, out);
    out.flush();
    in.close();
  }

  public static void printParagraph(int n, BufferedWriter out) {
    int numberOfTimes = (int) Math.pow(n, n);
    int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    while (numberOfTimes-- > 0) {
      printArray(arr, n, out);
      if (++arr[n - 1] > n) {
        arr[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
          if (++arr[i] > n) {
            arr[i] = 1;
          } else {
            break;
          }
        }
      }
    }
  }

  public static void printArray(int[] arr, int n, BufferedWriter out) {
    try {
      for (int i = 0; i < n - 1; i++) {
        out.write(arr[i] + ",");
      }
      out.write(arr[n - 1] + "\n");
    } catch (IOException ex) {

    }
  }
}
