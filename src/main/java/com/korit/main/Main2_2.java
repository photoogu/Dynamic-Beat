package com.korit.main;

import com.korit.util.ForEachPrinter;

public class Main2_2 {

    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] nums2 = new Integer[] {11, 12, 13, 14, 15, 16, 17, 18, 19};
        Integer[] nums3 = new Integer[] {111, 112, 113, 114, 115, 116, 117, 118, 119};

//        ForEachPrinter foreachPrinter = new ForEachPrinter();
//        foreachPrinter.print(nums);
//        foreachPrinter.print(nums2); >> new 로 매번 생성할 필요 없이,
//        foreachPrinter.print(nums3);    static 메서드일 경우엔 아래와 같이 바로 메서드 사용 가능!
        ForEachPrinter.print(nums);
        ForEachPrinter.print(nums2);
        ForEachPrinter.print(nums3);
    }

}
