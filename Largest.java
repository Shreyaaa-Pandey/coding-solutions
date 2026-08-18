import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // Take 10 inputs from user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Find 1st and 2nd largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            // Check if current element is largest
            if (arr[i] > largest) {
                secondLargest = largest; // old largest becomes 2nd largest
                largest = arr[i];        // update largest
            }
            // Check if current element is 2nd largest
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Display Results
        System.out.println("\n----- Results -----");
        System.out.print("Numbers entered : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Largest element        : " + largest);
        System.out.println("2nd Largest element    : " + secondLargest);

        sc.close();
    }
}