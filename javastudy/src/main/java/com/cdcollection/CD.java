package com.home.cdcollection;

public class CD {
    // ------------------------------------------------
    private String title;       // 제목
    private String artist;      // 연주자
    private int cost;           // 구입가격
    // ------------------------------------------------

    // 생성자 : 제목, 연주자, 구입가격 주어진 값으로 초기화 하면서 새로운 CD 객체 생성
    public CD(String title, String artist, int cost) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
    }

    @Override
    public String toString() {
        String str = "";
        str += "\nCD제목 : " + title;
        str += "\n아티스트 : " + artist;
        str += "\n가  격 : " + cost;
        return str;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
