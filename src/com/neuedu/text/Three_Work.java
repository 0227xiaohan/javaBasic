package com.neuedu.text;

import java.util.ArrayList;

public class Three_Work {
    public static void main(String[] args) {

        ArrayList<Three_work1> a=new ArrayList<>();
       a.add(new Three_work1("zhang3",18,3000));
       a.add(new Three_work1("li4",25,3500));
        a.add(new Three_work1("wang5",22,3200));
        a.add(1,new Three_work1("zhao6",24,3300));
        a.remove(new Three_work1("wang5",22,3200));
        for (Three_work1 b:a
             ) {
            System.out.println(b);
        }

    }


}
