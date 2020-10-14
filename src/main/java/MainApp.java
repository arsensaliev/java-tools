import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
    }

    public static int[] generateArrayAfter4(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
        }
        throw new RuntimeException("В массиве нет числа \"4\"");
    }

    public static boolean checkContain4And1ElementsInArray(int[] arr) {
        boolean isContain1 = false;
        boolean isContain4 = false;
        for (int j : arr) {
            if (j != 1 && j != 4) {
                return false;
            }
            if (j == 1) {
                isContain1 = true;
            }
            if (j == 4) {
                isContain4 = true;
            }
        }
        return isContain1 && isContain4;
    }
}
