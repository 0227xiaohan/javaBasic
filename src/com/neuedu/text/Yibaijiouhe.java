package com.neuedu.text;

public class Yibaijiouhe {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        int sum1=0;
        int sum2=0;

        for (;i<=100;i++) {
            sum = sum + i;

            if(i%2==0){
                sum1=sum1+i;
            }
            else{
                sum2=sum-sum1;
            }
        }
        System.out.println("一到一百所有数的和为："+sum);
        System.out.println("所有的偶数和为:"+sum1);
        System.out.println("所有的奇数和为:"+sum2);
    }
}
