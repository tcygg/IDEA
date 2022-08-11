package com.msb.test2;

/**
 * @Auther: ygg
 * @Date: 2022/6/2 - 06 - 02 - 19:54
 * @Description: com.msb.test2
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if("man".equals(sex) || "woman".equals(sex)) {
            this.sex = sex;
        }else {
            this.sex = "man";
        }
        }

    public Student(){

    }
    public Student(int age,String name,String sex){
        this.age=age;
        this.setSex(sex);//=sex;
        this.name=name;

    }

}

