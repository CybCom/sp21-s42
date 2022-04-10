import org.jetbrains.annotations.Contract;

public class Loop {
    /** Returns the maximum value from m. */

    public static int max(int[] m) {
        int i = 0;
        int max = 0;
        while (i < m.length) {
            if (m[i] > max) {
                max = m[i];
            }
            i++;
        }
        max = 0;
        for (int j = 0; j < m.length; j++) {
            if (m[j] > max) {
                max = m[j];
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.print(max(numbers));
    }
}


