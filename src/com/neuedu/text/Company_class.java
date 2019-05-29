package com.neuedu.text;
/* 假设要为某个公司编写雇员工资支付程序。
一般工人（Worker）按每月工作的天数计算工资；
销售人员（Salesman）在基本工资基础上每月还有销售提成；
经理（Manager）每月按固定工资支付，
 临时工（Floater）按小时支付。
要求描述所有雇员的共同特性（如姓名，性别，出生日期，员工类别），含有计算工资的方法computeSalay（）， 所有员工用该方法计薪。
*/
public class Company_class extends Company_class1 {

    private  int num;//工作天数
    private  float salary;//工资
    private  int ticheng;
    private int manager;
    private int hour;
    private  int money;

    public int getTicheng() {
        return ticheng;
    }

    public void setTicheng(int ticheng) {
        this.ticheng = ticheng;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    public void computeSalay(){
        float worker=num*salary;
        System.out.println("工人工资："+worker);
    }
    public void computeSalay1(){
       float salesman=num*salary+ticheng;
        System.out.println("销售人员:"+salesman);
    }
    public void computeSalay2(){
      int manger=manager;
        System.out.println("经理:"+manger);
    }
    public void computeSalay3(){
        int floater=hour*money;
        System.out.println("临时工:"+floater);
    }


}