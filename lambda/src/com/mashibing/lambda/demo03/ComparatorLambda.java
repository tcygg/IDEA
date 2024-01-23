package com.mashibing.lambda.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        String[] strs = {"dedeyidede", "abc", "de", "fghi"};
        // 使用匿名内部类的方式，实现比较器
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
//        Arrays.sort(strs, comparator);
        // TODO 使用Lambda表达式实现
        Arrays.sort(strs, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(strs));
    }
}
