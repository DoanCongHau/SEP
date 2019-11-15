

/**
 *
 * @author Công Hậu
 */
import java.util.Scanner;

public class SumFromAToB {

    public static void main(String[] args) {
        int a, b, sum1 = 0, sum2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("input a: ");
        a = sc.nextInt();
        System.out.println("input b: ");
        b = sc.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum1 += i;
            }
            System.out.println(sum1);
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum2 += i;
            }
            System.out.println(sum2);
        }
        if (a == b) {
            System.out.println(a);
        }

    }
}
