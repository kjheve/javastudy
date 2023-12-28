package com.kh.day7;

/*
    중첩 반복문 빠져나오기
    주어진 이차원배열에서 타겟값이 6이 되는 순간
    중첩 반복문을 빠져나오기
 */
public class ExitNestedLoops {
    public static void main(String[] args) {
        method1();
        System.out.println("-------------");
        method2();
    }

    // case2) 라벨
    private static void method2() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 6;

        outer: // 라벨명:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j] == target) {
                    System.out.println("값 : " + target + "을 찾았습니다." +
                            "위치 : arr[" + i + "][" + j + "]");
                    break outer;
                }
            }
            // System.out.println("innter 탈출! (행 끝나는 지점)");
        }
        System.out.println("outer 탈출!");
    }

    // case1) 상태 플래그를 이용한 방법
    public static void method1() {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 6;

        boolean stop = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                if (arr[i][j] == target) {
                    System.out.println("값 : " + target + "을 찾았습니다." +
                            "위치 : arr[" + i + "][" + j + "]");
                    stop = true;
                    break; // 가장 가까운 반복문 종료
                }
            }
            // System.out.println("innter 탈출! (행 끝나는 지점)");
            if (stop) {
                break;
            }
        }
        System.out.println("outer 탈출!");
    }

}
