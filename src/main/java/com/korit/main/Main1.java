package com.korit.main;

import com.korit.service.ATestService;
import com.korit.service.BTestService;
import com.korit.service.TestPrint;

import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        // version 1.0.0
//        int a = 10;                       // 변수 a에 데이터가 담김
//        System.out.println(a);            // 10
        TestPrint testPrint = null;
        ATestService aTestService = new ATestService(); // 변수 aTestService 에 생성된 객체의 메모리 주소 출력
        BTestService bTestService = new BTestService();
        TestPrint testPrint2 = new BTestService(); // 업캐스팅!
//        System.out.println(aTestService); // com.korit.service.ATestService@5594a1b5
//        System.out.println(bTestService); // com.korit.service.BTestService@6a5fc7f7
//        aTestService.print(); // ATestService 출력
//        bTestService.print(); // BTestService 출력

        Random random = new Random();
        int randomInt = random.nextInt(100);

        if (randomInt % 2 == 0) {
            testPrint = aTestService;
        } else {
            testPrint = bTestService;
        }

        testPrint.print();

    }
}
