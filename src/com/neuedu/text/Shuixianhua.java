package com.neuedu.text;

public class Shuixianhua {
    public static void main(String[] args) {

                  for(int i=100;i<=999;i++){
                 int  a=i%10;
                 int   b=i%100/10;
                 int   c=i/100;
                      if (i==a*a*a+b*b*b+c*c*c){
                          System.out.println(i);
                      }
                      else{
                          continue;
                      }
                  }

    }
}
