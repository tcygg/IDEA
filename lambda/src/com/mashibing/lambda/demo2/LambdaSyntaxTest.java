package com.mashibing.lambda.demo2;

/**
 * Lambda表达式测试类
 * 语法：
 *  (parameters) ->{ statements; }
 *  或
 *  (parameters) -> expression
 *
 * Lambda表达式与函数式接口的抽象函数格式一一对应
 * 前提：必须有一个函数式接口（@FunctionalInterface）
 *
 * 代码演示：
 *  0.Lambda表达式的基本格式
 *  1.省略大括号
 *  2.省略参数类型和大括号
 *  3.省略小括号
 *  4.Lambda表达式作为参数传递给方法
 */
public class LambdaSyntaxTest {
    public static void main(String[] args) {
        // 0.Lambda表达式的基本格式
        IMathOperation mo0 = (int a, int b) -> { return a + b; };
        System.out.println(mo0.operation(1, 2));
        // 1.省略大括号
        IGreeting greeting = (String msg) -> System.out.println("hello " + msg);
        greeting.sayHello("Lambda");
        // 2.省略小括号
        greeting = msg -> System.out.println("hello " + msg);
        greeting.sayHello("Pengpeng");
        // 3.省略return
        IMathOperation mo1 = (int a, int b) -> a + b;
        System.out.println(mo1.operation(3, 4));
        // 4.省略参数类型和大括号
        IMathOperation mo2 = (a, b) -> a - b;
        System.out.println(mo2.operation(6, 5));
    }
}
