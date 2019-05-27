package com.neuedu.Javabiji;

public class Liucheng {
    public static void main(String[] args) {

        //流程控制语句

        /*分支语句
         * if：如果，if（表达式）{   } */
        /*int  a=1;*/
//判断某个条件


        //switch-------------也是分支的的一种，
        //赋值时可以用int  char  byte  short，
    /*   int  a=3;
        switch(a){
            case 1:
            System.out.print(1);
            break;
            case 2:
                System.out.print(9);
                break;
            case 3:
                System.out.print(5);
                break;
            case 4:
                System.out.print(8);
                break;
            case 5:
                System.out.print(5);
                break;
            case 6:
                System.out.print(9);
                break;
            default:
                System.out.print("没哟匹配项");
        }//选择输出结果   */


        //循环语句
        /*for：   for（初始值；循环条件；计数，也是更新初始值）{    }
         * while：   while（初始值；循环条件） { 输出结果；     a++ }
         *
         *
         * */
//初始值可以写在外面也可以写在里面
     /*   for (int i = 1; i <= 20; i++){//括号内可以没有条件，但是必须要有分号
            //变量的作用域：在哪个范围内有效
            System.out.println("跑了第"+i+"圈");
        }*/
//循环外写一个输出语句，表示循环结束


        //如果已知循环条件，用for循环合适，不知道循环次数，用while循环
     /*   int   b=1;
        while(true){
            if(b==10){
                break;   //当条件合适的时候，结束循环
            }
            System.out.print(1);
            b++;
        }*/


        //do    while ;
     /*   int   a=3;
        do {
            System.out.print(3);
            a++;
        }while (a>5);*/
        //while   先判断条件是否成立
        //do    while  ：先执行，后判断，，，

 /*  for(int  i=1;i<=30;i++){
       if(i%2==0){
           continue;            //在指定的条件下，它是当次循环不执行
           //break：循环全部结束
           //return：结束主方法运行；
       }
   }*/


//重复同样的操作，重复多次，用循环    for   while

        /*
         */

        /*   int  a=1;*/
        /*   if(a>10){*/
        /*
         */

        /*   }*/
        //定义变量
        //数据类型
        /*   Scanner   input =new scanner (Sysout.in);*/
        /*     int result  =input.nextInt();       *//*可对控制台做输入*/
        /*     //  拆分出百位   十位 个位  依次拆分*/
        /*     int a=result/100;*/
        /*     int b=result%100/10;*/
        /*     int c=result%10;*/
        /*              System.out.print(c*100+b*10+a);*/
        /*              */

        //debug:打断点，，，一种模式

        /*      Random random=new Random();       //以下两行是生成随机数*/
        /*     int result=random.nextInt(10);      //bound:边缘数*/

        int a = 1;
        for (int i = 100; i <= 999; i++) {
            a = i % 10;
            System.out.println(a);
        }
  




    }
}
                  //预习面向对象，写思维导图，java思维导图总结
