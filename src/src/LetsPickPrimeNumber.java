import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Laith Mubarak
 */
public class LetsPickPrimeNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int upper = 7000000;
    int t = in.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    fillPrimes(arr, upper);
    while (t-- > 0) {
      int n = in.nextInt();
      if (n == 2) {
        System.out.println("0.000");
        continue;
      }
      int numberOfPrimes = binarySearch(arr, n);
      double ratio = (numberOfPrimes * 1.0) / (n - 2);
      System.out.printf("%1.3f\n", ratio);
    }
    in.close();
  }

  public static void fillPrimes(List<Integer> arr, int upper) {
    for (int i = 3; i <= upper; i++) {
      if (!containsOne(i) && isPrime(i)) {
        arr.add(i);
      }
    }
  }

  public static boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static boolean containsOne(int number) {
    while (number != 0) {
      int digit = number % 10;
      if (digit == 1) {
        return true;
      }
      number /= 10;
    }

    return false;
  }

  public static int binarySearch(List<Integer> arr, int number) {
    int l = 0, r = arr.size() - 1;
    while (l <= r) {
      int m = l + (r - l) / 2;

      if (arr.get(m) == number) {
        return m;
      }

      if (arr.get(m) < number) {
        l = m + 1;
      } else {
        r = m - 1;
      }
    }

    return l;
  }

}
