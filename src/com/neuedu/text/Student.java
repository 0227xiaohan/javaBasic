package com.neuedu.text;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {

        ArrayList<Student1>  list = new ArrayList<>();
        list.add(new Student1("Tom", 18, 100, "class05"));

        list.add(new Student1("Jerry", 22, 70, "class04"));

        list.add(new Student1("Oven", 25, 90, "class05"));

        list.add(new Student1("Jim", 30,80 , "class05"));

        list.add(new Student1("Setve", 28, 66, "class06"));

        list.add(new Student1("Kevin", 24, 100,"class04"));
         int scoreAver=ScoreAver(list);
        int ageAver = AgeAver(list);
        System.out.println("平均数"+ageAver);
        System.out.println("平均分"+scoreAver);
    }

    private static int ScoreAver(ArrayList<Student1> list) {
        int scoreAver;
        int scoresum = 0;
        for (Object o:list
        ) {
            Student1 stu = (Student1) o;
            scoresum+=stu.getScore();
        }
        scoreAver = scoresum/list.size();
        return scoreAver;
    }

    private static int AgeAver(ArrayList<Student1> list) {
        int ageAver;
        int agesum = 0;
        for (Object o:list
             ) {
            Student1 stu = (Student1) o;
            agesum+=stu.getAge();
        }
        ageAver = agesum/list.size();
        return ageAver;
    }
}
