package com.mashibing.lambda.demo04;

import java.util.Arrays;
import java.util.List;

/**
 * Lambda表达式的底层实现
 *  语法：
 *      (parameters) -> { statements; }
 *      或
 *      (parameters) -> expression
 *
 *  JVM参数：jdk.internal.lambda.dumpProxyClasses
 *      命令：java -Djdk.internal.lambda.dumpProxyClasses ClassName
 *      转储得到内部类：ClassName$$Lambda$1.class
 *      反编译：java -jar cfr-0.145.jar LambdaTest.class --decodelambdas false
 *  本质：函数式接口的匿名子类的匿名对象
 *  Lambda表达式与函数式接口的抽象函数格式一一对应
 */
public class LambdaPrinciple {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("马", "士", "兵");
        // 通过lambda表达式实现元素遍历
        strList.forEach(s -> {
            System.out.println(s);
        });
    }
}
        /*
        public class LambdaPrinciple {
            public static void main(String[] args) {
                List<String> strList = Arrays.asList("\u9a6c", "\u58eb", "\u5175");
                strList.forEach(
                    (Consumer<String>)LambdaMetafactory.metafactory(null, null, null,
                        (Ljava/lang/Object;)V,
                        lambda$main$0(java.lang.String ),
                        (Ljava/lang/String;)V
                )());
            }
            private static void lambda$main$0(String s) {
                System.out.println(s);
            }
        }

        final class LambdaPrinciple$$Lambda$1 implements Consumer {
            private LambdaPrinciple$$Lambda$1() {
            }

            @LambdaForm.Hidden
            public void accept(Object object) {
                LambdaPrinciple.lambda$main$0((String)object);
            }
        }

         */
