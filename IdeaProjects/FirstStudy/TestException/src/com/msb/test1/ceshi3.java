package com.msb.test1;
import java.util.InputMismatchException;
import java.util.Scanner;




public class ceshi3 {

    /*public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //检查异常：

       *//* try {
            Class.forName("com.msb.test01.Test").newInstance();//option+enter快捷键选择try-catch进行包围
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }*//*
        Class.forName("com.msb.test01.Test").newInstance();*/
    public static void main(String[] args) {

//快捷键是    option+enter
        try {
            Class.forName("com.msb.test01.Test");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

