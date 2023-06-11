import java.util.Scanner;

public class getArrayFromUserAndincrementElementsByOne {
    public static void main(String[] args) {

        int[] arr = new int[5];
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        size = scanner.nextInt();

        for (int i = 0; i < size; i++) {

            arr[i] = scanner.nextInt() + 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
