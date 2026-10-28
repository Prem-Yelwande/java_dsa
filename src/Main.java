public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Java DSA practice!");

        // Example: iterative binary search on a sorted array (O(log n) time)
        int[] sorted = {2, 4, 7, 9, 15};
        int target = 9;
        int index = binarySearch(sorted, target);
        if (index >= 0) {
            System.out.println("index of " + target + " = " + index);
        } else {
            System.out.println(target + " not found in the array");
        }

        // Try a missing value
        int missing = 10;
        int missingIndex = binarySearch(sorted, missing);
        System.out.println(missing + (missingIndex >= 0 ? " found at " + missingIndex : " not found"));

        // Edge case: empty array — should return -1
        int[] empty = {};
        int emptyResult = binarySearch(empty, 5);
        System.out.println("Empty array search result: " + emptyResult + " (expected -1)");
    }

    /**
     * Iterative binary search on an ascending array.
     * Time complexity: O(log n). Space complexity: O(1).
     * Returns the index of target, or -1 when the value is absent or the array is unusable.
     *
     * Assumes the input array is sorted in ascending order and contains no duplicates.
     * Handles null or empty arrays by returning -1.
     * Mid calculation uses left + (right - left) / 2 to avoid integer overflow.
     * Edge cases covered: null, empty, missing value, single-element array.
     */
    static int binarySearch(int[] values, int target) {
        if (values == null || values.length == 0) {
            return -1;
        }

        int left = 0;
        int right = values.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow
            if (values[mid] == target) {
                return mid;
            }
            if (values[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
