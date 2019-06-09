package com.neuedu.Javabiji;

public class GirlStudent_class extends Student_class implements Jie_kou{
    @Override
    public    void eat(){
        System.out.println("我是女同学，我嗑瓜子，吃水果...");
    }
   public void host(){
       System.out.println("女士们，先生们，大家好，我是主持人......");
    }
}
