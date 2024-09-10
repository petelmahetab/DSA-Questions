public class Eleventh {

    public static int returnPeakElement(int[] a, int n1) {
        // Handle cases with only one element
        if (n1 == 1) {
            return a[0];
        }

        // Handle cases where the first element is a peak
        if (a[0] > a[1]) {
            return a[0];
        }

        // Handle cases where the last element is a peak
        if (a[n1 - 1] > a[n1 - 2]) {
            return a[n1 - 1];
        }

        // Iterate through the array to find a peak element
        for (int i = 1; i < n1 - 1; i++) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                return a[i];
            }
        }

        // No peak found, though in theory this shouldn't happen with a valid peak definition
        return -1; // Returning -1 to indicate no peak found
    }

    public static void main(String[] args) {
        // Find a peak element in the given array
        int[] thisArray = {1, 3, 20, 4, 1, 0};
        int n = thisArray.length;
        System.out.println("Peak element is=>  "+returnPeakElement(thisArray, n));
    }
}
