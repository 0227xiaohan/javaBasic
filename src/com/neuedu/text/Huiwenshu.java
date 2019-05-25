package com.neuedu.text;

import java.util.Scanner;

public class Huiwenshu {
    public static void main(String[] args) {

Scanner o =new Scanner(System.in);
int i =o.nextInt();
           int a=i%10;
           int b=i%100/10;
           int c=i%1000/100;
           int d=i%10000/1000;
           int e=i/10000;
           if (i>100000||i<10000){
               System.out.println("不是五位数");
           }else if (a==e&&b==d){
               System.out.println(i+"为回文数");
           } else{
               System.out.println(i+"不是回文数");
           }


    }
}
