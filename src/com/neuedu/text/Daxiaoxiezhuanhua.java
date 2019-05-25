package com.neuedu.text;

import java.util.Scanner;

public class Daxiaoxiezhuanhua {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        String a=i.next();
        char m=(char)a.charAt(0);
        if (m>=97&&m<=122){
            m-=32;
            System.out.println(m);
        }
else{
            System.out.println(m);
        }
    }
}
