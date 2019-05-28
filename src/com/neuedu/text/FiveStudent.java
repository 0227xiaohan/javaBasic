package com.neuedu.text;

import java.util.Scanner;
//有五个学生，每个学生有3门课的成绩，
// 从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩

public class FiveStudent {
    public static void main(String[] args) {
      FIveStudent_class one=new FIveStudent_class();
      one.setStudentid("学号"+"001   ");
      one.setName("姓名："+"小韩   ");
      one.setChinese(90);
      one.setEngilsh(95);
      one.setMath(98);
      one.setPingjun();

        FIveStudent_class two=new FIveStudent_class();
        two.setStudentid("学号"+"002   ");
        two.setName("姓名："+"韩先生   ");
        two.setChinese(99);
        two.setEngilsh(95);
        two.setMath(98);
        two.setPingjun();

        FIveStudent_class three=new FIveStudent_class();
        three.setStudentid("学号"+"002   ");
        three.setName("姓名："+"韩先生   ");
        three.setChinese(99);
        three.setEngilsh(91);
        three.setMath(98);
        three.setPingjun();

    }
}
