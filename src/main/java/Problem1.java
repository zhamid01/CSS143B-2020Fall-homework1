/*
Name: Zayeem Hamid
Class: CSS143 B
Date: October 8th, 2020

These sites were used as help:
https://www.geeksforgeeks.org/binary-search/
https://www.tutorialspoint.com/data_structures_algorithms/binary_search_algorithm.htm
*/
public class Problem1 {
    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        if (data == null) {
            return -1;
        }
        int x = 0;
        int length = data.length - 1;

        while (x <= length) {
            int mid = x + (length - x) / 2;
            if (data[mid] == target) {
                return mid;
            }
            if (data[mid] < target) {
                x = mid + 1;
            }
            else {
                length = mid - 1;
            }
        }
        return -1;
    }
}