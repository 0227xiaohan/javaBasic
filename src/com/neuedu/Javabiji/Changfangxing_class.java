package com.neuedu.Javabiji;

public class Changfangxing_class {
       int width;
       int height;


    public void   space1(int height) {
        int      space1=width*height;
        int      girth1=(width+height)*2;
        System.out.println("面积为："+space1);
        System.out.println("周长为："+girth1);
    }

    public void  space2(int height,int width) {
        int space2 = width * height;
        int girth2 = (width + height) * 2;
        System.out.println("面积为：" + space2);
        System.out.println("周长为："+girth2);
    }

    public void  space() {
        int      space=width*height;
        int      girth3=(width+height)*2;
        System.out.println("面积为："+space);
        System.out.println("周长为："+girth3);
    }
}