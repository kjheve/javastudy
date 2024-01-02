package com.kh.day8.modifier.acess.pack1;
public class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public void print() {
        System.out.print(a + " "); // public
        System.out.print(b + " "); // protected
        System.out.print(c + " "); // default
        System.out.print(d);       // private
        System.out.println();
    }
}
