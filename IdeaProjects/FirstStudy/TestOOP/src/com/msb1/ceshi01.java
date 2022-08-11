package com.msb1;

/**
 * @Auther: ygg
 * @Date: 2022/5/6 - 05 - 06 - 9:58
 * @Description: com.msb1
 * @version: 1.0
 */
/**
* 功能描述:测试java中是值传递还是引用传递,基础类型一定是值传递,
* @param参数:
* @return返回值:
* @auther:
* @date:
 */
public class ceshi01 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(a[0]);
        b(a);
        System.out.println(a[0]);

    }

    public static void b(int[] i){
        i[0] = 100;
    }

    }

