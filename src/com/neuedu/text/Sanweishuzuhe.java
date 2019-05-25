package com.neuedu.text;

public class Sanweishuzuhe {
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        int j = 0;
        for(int b=0;b<a.length;b++){
            for(int c=0;c<a.length;c++){
                for (int d=0;d<a.length;d++){
                    if(a[b]!=a[c]&&a[b]!=a[d]&&a[c]!=a[d]){
                        System.out.println("组成的三位数为："+(a[b]*100+a[c]*10+a[d]));
                        j++;
                    }
                }
            }
        }
        System.out.println(j);
    }
}
