package com.home.cdcollection;

import java.util.Arrays;

public class CDCollection {
    // ----------------------------------------------
    private CD[] collection;        // CD 객체들의 배열
    private static int count;              // 수집한 CD들의 갯수
    private int totalCost;          // 총 구입 가격
    // ----------------------------------------------

    // 생성자 메소드 : 비어있는 배열 객체를 만든다.
    public CDCollection() {
        collection = new CD[5];
    }

    // addCD : 현 CDCollection 객체에 한 CD 객체를 추가한다.
    public void addCD(String name, String artist, int cost) {
        collection[count++] = new CD(name, artist, cost);
        totalCost += cost;
    }

    @Override
    public String toString() {
        String str = "";
        str += Arrays.toString(collection);
        str += "\n----------------------";
        str += "\nCD들의 수집 갯 수 : " + count;
        str += "\n총 가격 : " + totalCost;
        str += "\n----------------------";
        return str;
    }
}
