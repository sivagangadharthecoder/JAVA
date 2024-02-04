import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] array = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array using Bubble Sort
        for (int i = 0; i < size ; i++) {
            for (int j =0 ; j < size -1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
	
	System.out.println("sorted elements are: ");
	for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
