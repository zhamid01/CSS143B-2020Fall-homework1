public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length  - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int placeHolder = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = placeHolder;
                }
            }
        }
    }
}
