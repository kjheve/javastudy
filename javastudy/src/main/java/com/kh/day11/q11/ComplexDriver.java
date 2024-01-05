package com.kh.day11.q11;

public class ComplexDriver {
    public static void main(String[] args) {
        // x = 2 + 3i
        Complex x = new Complex(2, 3);
        // y = -3 + 7i
        Complex y = new Complex(-3, 7);
        // z
        Complex z = new Complex();

        // z = x-y
        z.substract(x, y);

        // x, y, z를 출력
        x.print();
        y.print();
        z.print();

    }
}
