package com.mashibing.lambda.demo03;

import java.util.function.Supplier;

public class SupplierLambda {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 52, 333, 23};
        // 调用getMax方法，参数传递Lambda
        int maxNum = getMax(() -> {
            // 查找数组的最大值
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxNum);
    }

    // 定一个方法方法的参数传递Supplier泛型使用Integer
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
