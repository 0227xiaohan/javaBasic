package com.neuedu.Javabiji;
/*
* 1、定义主持人接口，提供一个无参数无返回值的主持的方法；
2、定义学生类，提供一个无参数的无返回值的抽象的吃方法；
3、定义男同学类，继承学生类，吃的方法内容为：”我是男同学，我嗑瓜子，喝啤酒...”;
4、定义女同学类，继承学生类，同时实现主持人接口，主持方法的内容为：”女士们，先生们，大家好，我是主持人......”，吃的方法内容为：”我是女同学，我嗑瓜子，吃水果...”;
5、定义班级类，提供一个无返回值的，带两个参数的开晚会的方法，其中第1个参数为主持人接口类型，第二个参数为学生类型，方法内容中要求先调用主持人的主持方法，再打印一句话”晚会正式开始.....”,然后调用学生的吃的方法；
6、定义测试类，使用多态的形式分别创建学生类型的对象,主持人类型的对象，班级类型的对象（这个对象非多态），使用班级对象调用开晚会的方法；
   显示要求：女士们，先生们，大家好，我是主持人......
晚会正式开始.....
我是男同学，我嗑瓜子，喝啤酒...

* */
public class Text {
    public static void main(String[] args) {
      GirlStudent_class girl=new GirlStudent_class();
      girl.host();
      Banji_class banji=new Banji_class();
      banji.Student();
      BoyStudent_class boy=new BoyStudent_class();
      boy.eat(); GirlStudent_class girl1=new GirlStudent_class();
      girl1.eat();
    }
}
