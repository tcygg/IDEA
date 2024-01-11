package com.mashibing.lambda.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: TcYgg
 * @Date: 2023/12/25 - 12 - 25 - 10:56
 * @Description: com.mashibing.lambda.demo1
 * @version: 1.0
 */
public class ceshi003 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("周杰伦", 33, 175));
        list.add(new Person("刘德华", 43, 185));
        list.add(new Person("周星驰", 38, 177));
        list.add(new Person("郭富城", 23, 170));

       /* Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getAge() - o2.getAge();
            }
        });*/

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getAge()>o2.getAge() ? 1 : -1;
            }
        });

        for (Person person : list) {
            System.out.println(person);
        }
    }


}
