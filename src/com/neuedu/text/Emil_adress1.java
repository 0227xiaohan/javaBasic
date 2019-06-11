package com.neuedu.text;

public class Emil_adress1 {
    private String name;
    private String jiedao;
    private String sheng;
    private String shi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJiedao() {
        return jiedao;
    }

    public void setJiedao(String jiedao) {
        this.jiedao = jiedao;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
 public Emil_adress1(String name, String jiedao, String sheng, String shi,String content){
     this.content=content;
     this.jiedao=jiedao;
     this.name=name;
     this.sheng=sheng;
     this.shi=shi;
 }

    @Override
    public String toString() {
        return name+jiedao+sheng+shi+content;
    }
}
