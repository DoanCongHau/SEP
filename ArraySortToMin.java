
import java.util.Scanner;

/**
 *
 * @author Công Hậu
 */
public class ArraySortToMin {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Input elements: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        sort(arr);
        System.out.println("Numbers are sorting ascendingly: ");
        show(arr);
    }

    public static void sort(int[] arr) {
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
        System.out.println("\n Min element: ");
        System.out.println(arr[0]);
    }
}
