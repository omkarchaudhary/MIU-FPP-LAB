package com.miu;

public class MergedTwoSortArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2, if any
            nums1[finished--] = nums2[tail2--];
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,0,0,0};

        int[] nums2 = {2,5,6};
        for (int i: merge(nums1,4,nums2,3)
             ) {
            System.out.print(i);
        }

    }
}
