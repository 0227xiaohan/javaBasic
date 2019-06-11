package com.neuedu.text;

import java.util.ArrayList;

public class Emil_adress {
    public static void main(String[] args) {
        ArrayList<Emil_adress1> emil=new ArrayList<>();
        emil.add(new Emil_adress1("zhang","xibadao","gansu","lanzhou","china"));
        emil.add(new Emil_adress1("zhangsan","xibadao","gansu","lanzhou","china"));

        for (Emil_adress1 a:emil
             ) {
            System.out.println(emil);
        }

    }



}
