package com.neuedu.text;

public class Computer_class {
    private char color;
    private int cpu;

    public Computer_class(char color,int cpu){   //构造方法
        this.color=color;//调用当前
        this.cpu=cpu;
    }
    public void o(){
        System.out.println("笔记本颜色"+color+","+"型号"+cpu);
    }
}

