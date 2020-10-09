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

            for (int j = 0; j < data.length  - x - 1; j++) {

                if (data[j] > data[j + 1]) {

                    int placeHolder = data[j];

                    data[j] = data[j + 1];

                    data[j + 1] = placeHolder;
                }
            }
        }
    }
}
