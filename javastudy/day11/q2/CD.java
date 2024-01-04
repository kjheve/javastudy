package com.kh.day11.q2;

public class CD {
    private String title;
    private String artist;
    private int cost;

    public CD(String title, String artist, int cost) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
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

    @Override
    public String toString() {
        String str = "";
        str += "제목 : " + title + "\n";
        str += "연주자 : " + artist + "\n";
        str += "구입가격 : " + cost + "\n";
        return str;
    }

    public static void main(String[] args) {
        CD cd = new CD("4집", "아이", 20_000);
        System.out.println(cd);
    }
}
