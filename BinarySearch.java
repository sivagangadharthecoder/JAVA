import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        
        int low = 0;
        int high = size - 1;
        int mid = (low + high) / 2;

        boolean found = false;
        
	    int j =0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == key) {
                found = true;
                break;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
	       j++;
        }
        
        if (found) {
            System.out.println("Element found at index: " + mid);
        } else {
            System.out.println("Element not found");
        }
        
        scanner.close();
    }
}
