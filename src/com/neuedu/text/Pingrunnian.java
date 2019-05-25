package com.neuedu.text;

import java.util.Scanner;

public class Pingrunnian {
    public static void main(String[] args) {
        Scanner   i=new Scanner(System.in);
        int   a=i.nextInt();
        if(a%4==0&&a%100!=0){
            System.out.println(a+"为闰年");
        }
        else if (a%400==0){
            System.out.println(a+"为闰年");
        }
        else {
            System.out.println(a+"为平年");
        }
    }
}
