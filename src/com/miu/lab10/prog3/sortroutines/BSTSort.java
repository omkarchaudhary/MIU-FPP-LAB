package com.miu.lab10.prog3.sortroutines;

import com.miu.lab10.prog3.runtime.Sorter;

public class BSTSort extends Sorter {

    @Override
    public int[] sort(int[] arr) {
        MyBST bst = new MyBST();
        bst.insertAll(arr);

        return bst.readIntoArray();
    }

}
