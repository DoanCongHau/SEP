
import java.util.Scanner;

/**
 *
 * @author Công Hậu
 */
public class SapXepToMin {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        sapXep(arr);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(arr);
    }

    public static void sapXep(int[] arr) {
        int tam = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tam = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tam;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");    
        }
        System.out.println("\n Phan tu nho nhat la: ");
        System.out.println(arr[0]);
    }
}