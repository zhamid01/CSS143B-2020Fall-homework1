public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        int s = 0;
        int length = data.length - 1;

        while (s <= length) {
            int mid = s + (length - s) / 2;
            if (data[mid] == target) {
                return mid;
            }
            if (data[mid] < target) {
                s = mid + 1;
            }
            else {
                length = mid - 1;
            }
        }
        return -1;
    }
}