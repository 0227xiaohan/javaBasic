package com.neuedu.text;

public class Text {
    public static void main(String[] args) {
        int a =135;
        int b =0;
        while(a!=0) {
            b = a % 10;
            System.out.print(b);
            a = a / 10;
        }
    }
}
