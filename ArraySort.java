
import java.util.Scanner;

/**
 *
 * @author Công Hậu
 */
public class ArraySort {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number of element: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Input elements of array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        sapXep(arr);
        System.out.println("Numbers are sorting ascendingly: ");
        show(arr);
    }

    public static void sorting(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
