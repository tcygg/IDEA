package com.mashibing.lambda.demo1;

public class SubClass implements Factory {
    @Override
    public Object getObject() {
        return new User();
    }
}
