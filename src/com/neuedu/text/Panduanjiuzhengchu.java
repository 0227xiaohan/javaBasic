package com.neuedu.text;

import java.util.Scanner;

public class Panduanjiuzhengchu {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int a=i.nextInt();
        int b=0;
        while(a>0){
            b=a%10+b;
            a=a/10;
        }  if(b%9==0){
            System.out.println("能被九整除");
        }
        else{
            System.out.println("不能被九整除");
        }
     }


}
