package com.mashibing.lambda.demo05;

import java.io.PrintStream;

public class MethodReferenceFirstGo {
    // 定义一个方法,参数传递Printable接口,对字符串进行打印
    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        // 调用printString方法,方法的参数Printable是一个函数式接口,所以可以传递Lambda
        printString(s -> {
            System.out.println(s);
        });

        /*
        分析：
            为什么需要方法引用？
            当Lambda表达式所要完成的业务逻辑已经存在————已经有某个函数实现了
            我们可以直接引用对应的方法（函数），即方法引用

            普通方法引用：
                对象名 :: 方法名
         */
        PrintStream out = System.out;
//        printString(System.out::println);
        printString(out::println);
    }
}
/*
public class Demo01Printable {
    public static void printString(Printable p) {
        p.print("HelloWorld");
    }

    public static void main(String[] args) {
        Demo01Printable.printString((Printable)LambdaMetafactory.metafactory(
            null, null, null,
            (Ljava/lang/String;)V,
            lambda$main$0(java.lang.String ),
            (Ljava/lang/String;)V)()
        );

        PrintStream printStream = System.out;
        Objects.requireNonNull(printStream);
        Demo01Printable.printString((Printable)LambdaMetafactory.metafactory(
            null, null, null,
            (Ljava/lang/String;)V,
            println(java.lang.String ),
            (Ljava/lang/String;)V)((PrintStream)printStream)
        );
    }

    private static void lambda$main$0(String s) {
        System.out.println(s);
    }
}

转储得到：java -Djdk.internal.lambda.dumpProxyClasses com.mashibing.lambda.demo05.Demo01Printable
    Demo01Printable$$Lambda$1.class
    Demo01Printable$$Lambda$2.class

反编译之后：java -jar cfr-0.145.jar Demo01Printable$$Lambda$1.class --decodelambdas false

final class Demo01Printable$$Lambda$1
implements Printable {
    private Demo01Printable$$Lambda$1() {
    }

    @LambdaForm.Hidden
    @Override
    public void print(String string) {
        Demo01Printable.lambda$main$0(string);
    }
}

final class Demo01Printable$$Lambda$2
implements Printable {
    private final PrintStream arg$1; // 即System.out

    private Demo01Printable$$Lambda$2(PrintStream printStream) {
        this.arg$1 = printStream;
    }

    private static Printable get$Lambda(PrintStream printStream) {
        return new Demo01Printable$$Lambda$2(printStream);
    }

    @LambdaForm.Hidden
    @Override
    public void print(String string) {
        this.arg$1.println(string);
    }
}

 */