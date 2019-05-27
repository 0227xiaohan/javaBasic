package com.neuedu.text;

public class Chengji {
    public static void main(String[] args) {
   int     i=77;
   if( i>=90){
       System.out.println("A");
   }
   else if(i>=60&&i<=89){
       System.out.println("B");
   }
   else if(i<60&&i>=0){
       System.out.println("C");
   }
   else{
       System.out.println("分数不规范");
   }
    }
}
//在外面可以套for死循环和while循环，括号内可以不写东西，但分号不可少，
// 好处：每次不用重新启动一次；