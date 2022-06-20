package com.miu.lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Prog8Test {
    @Test
    public void find_min_fromarrayList(){
        int[] arr = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int expectedOutput = -22;
        int actualOutput = Prog8.min(arr);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
