/*
Name: Zayeem Hamid
Class: CSS143 B
Date: October 8th, 2020

These sites were used as help:
https://www.geeksforgeeks.org/bubble-sort/
https://junit.org/junit4/javadoc/4.12/org/junit/Assert.html
*/
public class Problem2 {
    // Do not change signature (function name, parameters)
    //Sorting: Ascending
    public static void bubbleSort(int[] data) {
        for (int x = 0; x < data.length - 1; x++) {

            for (int y = 0; y < data.length  - x - 1; y++) {

                if (data[y] > data[y + 1]) {

                    int placeHolder = data[y];

                    data[y] = data[y + 1];

                    data[y + 1] = placeHolder;
                }
            }
        }
    }
}
