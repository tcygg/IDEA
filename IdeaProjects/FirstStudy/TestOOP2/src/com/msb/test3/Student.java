package com.msb.test3;

/**
 * @Auther: ygg
 * @Date: 2022/6/4 - 06 - 04 - 0:18
 * @Description: com.msb.test3
 * @version: 1.0
 */
public class Student extends Person {
    private int sno;//student number

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    public int studyaa(){
        return aa;
    }
    public void study(){
        System.out.println("我可以好好学习....");
    }
    public void eat(int weight,String type){
        System.out.println("可以吃饭...子类,吃小龙虾喝啤酒");
        System.out.println(type+"..."+weight);

    }
    public void super_ceshi(String ceshi){
        this.favorite_sports=ceshi;
        System.out.println(super.favorite_sports);
        eat(289,"hah");
    }
}
