package com.neuedu.text;

public class Sandebeishuhe {
    public static void main(String[] args) {
       int i=1;
       int sum=0;
       while(i<=200){
           if(i%3==0){
               sum=sum+i;
           }
           i++;
          }
        System.out.println("1-200之间所有三的倍数和为："+sum);
    }
}
