import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Laith Mubarak
 */
public class LetsCreateGroups {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    Arrays.sort(arr);

    int[] diff = new int[n - 1];
    for (int i = 0; i < diff.length; i++) {
      diff[i] = arr[i + 1] - arr[i];
    }

    Arrays.sort(diff);
    int result = 0;
    for (int i = 0; i < diff.length - m + 1; i++) {
      result += diff[i];
    }

    System.out.println(result);
  }

}
