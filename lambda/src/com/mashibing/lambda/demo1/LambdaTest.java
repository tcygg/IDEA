package com.mashibing.lambda.demo1;

/**
 * Lambda表达式初体验
 *  代码更简洁
 *  函数式编程：更关注函数/功能，而非对象
 *      函数是“第一等公民”
 *      可以赋值给变量
 *      可以作为（其它函数的）参数进行传递
 *      可以作为（其它函数的）返回值
 */
public class LambdaTest {
    public static void main(String[] args) {
        // 1. 子类实现接口
        Factory factory = new SubClass();

        User user1 = (User) factory.getObject();
        System.out.println(user1);

        // 2. 匿名内部类
        factory = new Factory() {
            @Override
            public Object getObject() {
                return new User("张三", 391);
            }
        };
        User user2 = (User) factory.getObject();
        System.out.println(user2);

        // 3. lambda表达式
        factory = () -> {return new User("李四", 18);};
        // 补充：函数体中，只有简单的表达式语句时，可以省略大括号{}
        factory = () -> new User("王五", 20);
        User user3 = (User) factory.getObject();
        System.out.println(user3);

        // Lambda作为参数进行传递
//        User user4 = getUserFromFactory(factory, "User");
//        System.out.println(user4);
        User user4 = getUserFromFactory(() -> {return new User("赵六", 18);}, "User");
        System.out.println(user4);

        // Lambda作为函数的返回值
        factory = getFactory();
        System.out.println(factory.getObject());
    }

    public static User getUserFromFactory(Factory factory, String beanName) {
        Object obj = factory.getObject();
        if (obj != null && obj.getClass().getSimpleName().equals(beanName)) {
            return (User)obj;
        }
        return null;
    }

    public static Factory getFactory() {
        return () -> {return new User("钱七", 18);};
    }
}
