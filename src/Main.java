public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int[] sorted = {2, 4, 7, 9, 15};
        int target = 9;
        int index = binarySearch(sorted, target);
        System.out.println("index of " + target + " = " + index);
    }

    /**
     * Iterative binary search on an ascending array.
     * Returns the index of target, or -1 when the value is absent or the array is unusable.
     */
    static int binarySearch(int[] values, int target) {
        if (values == null || values.length == 0) {
            return -1;
        }

        int left = 0;
        int right = values.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
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
