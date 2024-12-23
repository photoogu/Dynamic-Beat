package com.korit.main;

public class Main7 {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() { // 익명클래스!
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    try {
                        System.out.println("첫번째 반복문 i: " + i);
                        Thread.sleep(1000); // 스레드 실행 시간 늦춤
                    } catch (InterruptedException e) { // run 메서드 내에서 예외처리 해야함! >> 메서드에서 throws 할 수 없음(오버라이딩이기 때문)
                        // Interrupted : 프로그램 중간에 끼어드는 행위에 대한 예외
                        // for 문이 돌고있는데 sleep 으로 개입을 함 >> 이 시점에 오류 발생 가능성 있음
                        System.out.println("프로그램에 오류가 발생함.");
                    }
                }
            }
        };

        Thread t1 = new Thread(runnable); // public Thread(Runnable runnable); 생성자 호출
        t1.start(); // 스레드 시작

        Runnable runnable2 = () -> { // 람다를 사용하면 위의 runnable 보다 더 간단하게 표현할 수 있음
            for(int i = 0; i < 100; i++) {
                try {
                    System.out.println("두번째 반복문 i: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("프로그램에 오류가 발생함.");
                }
            }
        };

        Thread t2 = new Thread(runnable2);
        t2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("MAIN Thread i: " + i);
            Thread.sleep(1000);
        }
    // sleep 이 모두 동일하게 1초이기 때문에 실행에 순서가 없음 >> sleep 을 각 다르게 설정하면 순서 정할 수 있음
    }

}
