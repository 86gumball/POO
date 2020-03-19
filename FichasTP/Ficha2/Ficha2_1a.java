import java.util.Scanner;

public class Ficha2_1a {
    public static void main (String[] args) {
        // Utilities needed
        ArrayUtils au = new ArrayUtils();
        Scanner scanner = new Scanner(System.in);

        // Getting a size for the array and declaring it
        System.out.println("Choose an array size (int):");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Filling up the array
        System.out.println("Enter " + size + " integers, one at a time: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Getting the minimum of the array and printing it in the chat
        int min = au.minArray(arr);
        System.out.printf("The minimum in the array is: %d\n", min);
    }
}
