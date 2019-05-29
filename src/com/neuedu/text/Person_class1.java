package com.neuedu.text;

public class Person_class1 {

    public String name;
    public int weight;
    public int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public   void  sayHello(){
        System.out.println("hello,my name is"+name);
    }
}
