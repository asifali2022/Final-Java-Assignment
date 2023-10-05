package q07;

import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
	
		   Scanner scanner = new Scanner(System.in);

	        // Sorted array for binary search
	        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

	        // Accept user input for the target value
	        System.out.print("Enter the target value to search for: ");
	        int target = scanner.nextInt();

	        // Perform binary search
	        int result = binarySearch(sortedArray, target);

	        // Output the result
	        if (result == -1) {
	            System.out.println("Target value not found in the array.");
	        } else {
	            System.out.println("Target value found at index: " + result);
	        }

	        scanner.close();
	}
	
    // Binary search implementation
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Target not found in the array
        return -1;
    }
            
        }
    
    
    
	
