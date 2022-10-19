import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Laith Mubarak
 */
public class HappyNumbers {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String number = in.nextLine();
    BigInteger bigInteger = new BigInteger(number);
    System.out.println(bigInteger.divide(new BigInteger("2")));
    in.close();
  }

}
