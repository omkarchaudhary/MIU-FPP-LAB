package com.miu.lab2;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

//public class Prog6Test {
//    @Test
//    public void testRemoveDups(){
//        String[] testData = new String[]{"horse", "dog", "cat", "horse","dog"};
//        String[] actualOutput = Prog6.removeDups(testData);
//        String[] expectedOutput =  {"cat", "dog", "horse"};
//        boolean result = Arrays.equals(actualOutput,expectedOutput);
//        Assertions.assertTrue(result);
//    }
//
//}
public class Prog6Test extends TestCase {
    @Test
    public void testRemoveDups() {
        String[] testData = {"horse", "boy", "horse", "boy", "boy"};
        String[] result = Prog6.removeDups(testData);
        assertTrue(noDups(result));
        assertTrue(noNewData(testData, result));
    }

    boolean noDups(String[] arr) {
        int len = arr.length;
        for(int i = 1; i < len; ++i) {
            for(int j = 0; j < i; ++j) {
                if(arr[j].equals(arr[i])) {
                    return false;
                }
            }


        }
        return true;
    }

    /** Return true if every element of arr2 is an element of arr1 */
    boolean noNewData(String[] arr1, String[] arr2) {
        for(String s : arr2) {
            if(!arrayContains(arr1, s)) return false;
        }
        return true;
    }

    boolean arrayContains(String[] arr, String s) {
        for(String t: arr) {
            if(t.equals(s)) return true;
        }
        return false;
    }
}
