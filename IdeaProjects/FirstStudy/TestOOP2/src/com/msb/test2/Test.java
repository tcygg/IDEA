package com.msb.test2;

/**
 * @Auther: ygg
 * @Date: 2022/6/2 - 06 - 02 - 19:56
 * @Description: com.msb.test2
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {


        Student st = new Student();
        st.setAge(19);
        st.setName("张三");
        st.setSex("woman");
        System.out.println(st.getSex()+st.getName()+st.getAge());

        Student s2=new Student(15,"jack","1man");
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());

    }
}