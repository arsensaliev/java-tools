import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    @org.junit.jupiter.api.Test
    public void testGenerateArrayAfter4() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = {5, 6, 7, 8};
        Assertions.assertArrayEquals(result, MainApp.generateArrayAfter4(arr));
    }

    @org.junit.jupiter.api.Test
    public void testThrowRuntimeException() {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        Assertions.assertThrows(RuntimeException.class, () -> {
            MainApp.generateArrayAfter4(arr);
        });
    }

    @org.junit.jupiter.api.Test
    public void testArrayContain1And4Elements() {
        int[] arr = {1, 3, 4, 5};
        Assertions.assertFalse(MainApp.checkContain4And1ElementsInArray(arr));
    }

    @org.junit.jupiter.api.Test
    public void test2ArrayContain1And4Elements() {
        int[] arr = {1, 4, 1};
        Assertions.assertTrue(MainApp.checkContain4And1ElementsInArray(arr));
    }
}
