package com.korit.main;

import com.korit.util.ForEachPrinter;

public class Main2 {

    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] nums2 = new Integer[] {11, 12, 13, 14, 15, 16, 17, 18, 19};
        Integer[] nums3 = new Integer[] {111, 112, 113, 114, 115, 116, 117, 118, 119};

//        for (Integer num : nums) {
//            System.out.println(num);
//        }
//
//        for (int i=0; i<nums2.length; i++) {
//            System.out.println(nums2[i]);
//        }

        ForEachPrinter foreachPrinter = new ForEachPrinter();
        foreachPrinter.print(nums);
        foreachPrinter.print(nums2);
        foreachPrinter.print(nums3);
    }

}
