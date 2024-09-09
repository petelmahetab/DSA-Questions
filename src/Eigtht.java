import java.util.Arrays;

public class Eigtht {
    // Approach: O(n^2) - Sorting + Checking adjacent elements
    public static void returnDuplicate(int[] ar, int n1) {
        boolean result = false;

        // Loop through the array using indices
        for (int i = 0; i < n1; i++) {
            // Check if consecutive elements are duplicates
            if (ar[i] == ar[i + 1]) {
                // Ensure not to print the same duplicate multiple times
                if (i == 0 || ar[i] != ar[i - 1]) {
                    System.out.print(" "+ar[i]);
                }
                result = true;
            }
        }

        // If no duplicates are found, print "Not Found"
        if (!result) {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        // Find duplicates in the given array and return them
        int[] myArr = {1, 2, 3, 6, 3, 6, 1};
        int n = myArr.length - 1;

        // Sort the array so that duplicates are adjacent
        Arrays.sort(myArr);

        // Call the function to find and print duplicates
        returnDuplicate(myArr, n);
    }
}
