package com.neuedu.Javabiji;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Diaoyongchang {
    public static void main(String[] args) {

      Changfangxing_class  changfangxing=new Changfangxing_class();
        changfangxing.height=1;
        changfangxing.width=1;
        changfangxing.space();

        Changfangxing_class  changfangxing1=new Changfangxing_class();
        changfangxing1.height=10;
        changfangxing1.width=10;
        changfangxing1.space1(10);

    Changfangxing_class  changfangxing2=new Changfangxing_class();
        changfangxing2.height=10;
        changfangxing2.width=15;
        changfangxing2.space2(15,10);
    }

}
