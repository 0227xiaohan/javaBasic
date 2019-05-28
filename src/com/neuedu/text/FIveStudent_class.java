package com.neuedu.text;

public class FIveStudent_class {


    private     String  studentid;
    private     String name;
    private     int chinese;
    private     int math;
    private     int engilsh;
    private     int  pingjun=(chinese+math+engilsh)/3;
    public void setName(String name){
            this.name=name;//调用当前
            }
   public   String getName(){
            return name;
   }

       public void setStudentid(String studentid){
            this.studentid=studentid;
       }
       public String getStudentid(){
            return studentid;
       }

    public void setChinese(int chinese){
        this.chinese=chinese;
    }
    public int getChinese(){
        return chinese;
    }

    public void setMath(int math){
        this.math=math;
    }
    public int getMath(){
        return math;
    }

    public void setEngilsh(int engilsh){
        this.engilsh=engilsh;
    }
    public int getEngilsh(){
        return engilsh;
    }

    public void setPingjun(){
            int a=(getChinese()+getEngilsh()+getMath())/3;
            System.out.println(getStudentid()+getName()+"平均数"+a);
        }
    }





