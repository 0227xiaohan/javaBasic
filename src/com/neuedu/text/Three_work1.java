package com.neuedu.text;

public class Three_work1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money;
    public Three_work1(String name,int age,int money){
        this.age=age;
        this.money=money;
        this.name=name;
    }

    @Override
    public String toString() {
        return age+name+money;
    }
public void work(){
    System.out.println("123");
}

}
