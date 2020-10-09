import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {91, 21, 19, 22, 25},
                {6,2,11,1,4,19},
                {6,12,9,2,8,4,3,11,22,1}
        };
        int answer[][] = {
                {19, 21, 22, 25, 91},
                {1,2,4,6,11,19},
                {1,2,3,4,6,8,9,11,12,22}
        };
        for (int i = 0; i < inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            try {
                assertArrayEquals(answer[i], inputs[i]);
            } catch (AssertionError e) {
                System.out.println("test case " + i + " failed " + e);
            }
        }
    }
}
