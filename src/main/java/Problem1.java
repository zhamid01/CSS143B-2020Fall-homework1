public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        if (data == null || data.length == 0) {
            return -1;
        }
        int mid = (data.length) / 2;
        while (mid <= data.length - 1) {
            if (data[mid] == target) {
                return mid;
            } else if (data[mid] > target) {
                mid++;
            } else if (data[mid] < target) {
                mid--;
            }
        }
        return -1;
    }
}