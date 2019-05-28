package com.company;

public class Main {

    public static void main(String[] args) {
        int x1 = 0b00001111;
        int x2 = 0b00110011;
        int x3 = 0101010101;

        int f = 0b00010111;

        int Mask1 = 0b11111111;
        int Mask2 = 0b10000000;
        int result = f & Mask2;

        do {
            System.out.println(Integer.toBinaryString(f));
            f = f ^ (f >> 1);
            Mask1 = Mask1 >> 1;
            f = f & Mask1;
            result = result | f;
            Mask2 = Mask2 | (Mask2 >> 1);
            result = result & Mask2;

        } while (f > 1);


        System.out.println(Integer.toBinaryString(f));
        System.out.println(Integer.toBinaryString(result));
        if (result > 1) {
            System.out.print("f(x1,x2,x3) = x1x2⊕x2x3⊕x1x3");

        }
    }
}
