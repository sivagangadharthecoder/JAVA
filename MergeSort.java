import java.util.Scanner;

public class MergeSort{

    public static void merge(int[] A, int[] left, int leftsize, int[] right, int rightsize) {
        int i = 0, j = 0, k = 0;
        while (i < leftsize && j < rightsize) {
            if (left[i] < right[j]) {
                A[k] = left[i];
                i++;
            } else {
                A[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftsize) {
            A[k] = left[i];
            i++;
            k++;
        }
        while (j < rightsize) {
            A[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] A, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = A[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = A[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(A, left, mid, right, n - mid);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[100];
        System.out.println("Enter the size of unsorted array: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of unsorted array: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        mergeSort(A, n);
        System.out.println("Sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        scanner.close();
    }
}

