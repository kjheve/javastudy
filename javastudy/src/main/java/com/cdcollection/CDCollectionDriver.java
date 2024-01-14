package com.home.cdcollection;

public class CDCollectionDriver {
    public static void main(String[] args) {

        CDCollection cdCol = new CDCollection();

        cdCol.addCD("가야금 작품집", "홍길동", 25_000);
        cdCol.addCD("희망의 노래", "김길동", 20_000);
        cdCol.addCD("거문고 작품집", "이갑순", 30_000);
        System.out.println(cdCol);
        cdCol.addCD("기타 노래", "전훙동", 40_000);
        cdCol.addCD("바이올린 작품집", "고소문", 30_000);
        System.out.println(cdCol);
    }
}
