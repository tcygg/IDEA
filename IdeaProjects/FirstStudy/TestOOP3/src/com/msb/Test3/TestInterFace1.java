package com.msb.Test3;

/**
 * @Auther: zhaoss
 * @Date: 2022/7/1 - 07 - 01 - 06:25
 * @Description: com.msb.Test3
 * @version: 1.0
 */
public interface TestInterFace1  {
    public static final int NUM=10;
    public abstract void a();
    void d();

}

class birds implements TestInterFace1{

    public void a(){
        System.out.println("我会飞");
    }
    public void d(){
        System.out.println("2222222222");
    }
}
class kits implements TestInterFace1{

    public void a(){
        System.out.println("我会飞11");
    }
    public void d(){
        System.out.println("2222222222");
    }
}


