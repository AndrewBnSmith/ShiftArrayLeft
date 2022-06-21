import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayLeft = new int[]{2, 3, 9, 17, 32, 73, 40, 21, 10};

        System.out.println("Before shifting:" + "\n" + Arrays.toString(arrayLeft) + "\n");

        int temp = arrayLeft[0];
        for (int i = 0; i < arrayLeft.length - 1; i++) {
            arrayLeft[i] = arrayLeft[i + 1];
        }
        arrayLeft[arrayLeft.length - 1] = temp;

        System.out.println("After shifting:" + "\n" + Arrays.toString(arrayLeft));
    }
}