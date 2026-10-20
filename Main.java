import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static BigInteger getNumberOfCombinations(Scanner input, int n, int k) {
        System.out.println("Enter n:");
        n = Integer.parseInt(input.nextLine());
        System.out.println("Enter k:");
        k = n = Integer.parseInt(input.nextLine());
        return combine(n);
    }
    public static BigInteger combine(int n) {
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger result = getNumberOfCombinations(input, 5, 3);
        Scanner in = new Scanner(System.in);
        System.out.println(combine(n));
    }
/**
 */
}

