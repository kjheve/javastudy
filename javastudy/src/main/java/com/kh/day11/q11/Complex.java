package com.kh.day11.q11;

public class Complex {
    private double realPart; // 실수부의 값
    private double imaginaryPart; // 허수부의 값

    public Complex() {
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void print() {
        System.out.println("(" + realPart+", "+imaginaryPart + ")");
    }

    public Complex substract(Complex complex1, Complex complex2) {
        Complex result = null;
        realPart = complex1.getRealPart() - complex2.getRealPart();
        imaginaryPart = complex1.getImaginaryPart() - complex2.getImaginaryPart();
        result = new Complex(realPart, imaginaryPart);
        return result;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
