package com.mashibing.lambda.demo03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/10 - 01 - 10 - 16:44
 * @Description: com.mashibing.lambda.demo03
 * @version: 1.0
 */
public class StreamTest05 {
    public static void main(String[] args) {
        Stream<String> a1 = Stream.of("a1", "a2", "a3" ,"b3");

        a1
                .filter(s->s.startsWith("b"))
                .forEach(System.out::println);


        String[] arrbb = {"aa","bb","cc"};
//        Stream<String> a1 = Stream.of("a1", "a2", "a3" ,"b3");
        Stream<String> abbb = Stream.of(arrbb);

        abbb
                .filter(s->s.startsWith("b"))
                .forEach(System.out::println);


//        a1.forEach(System.out::println);

        String[] arr1 = {"aa","bb","cc"};
        Stream<String> arr11 = Stream.of(arr1);
        Integer[] arr2 = {1,2,3,4};
        Stream<Integer> arr21 = Stream.of(arr2);
        arr21.forEach(System.out::println);
        // 注意：基本数据类型的数组是不行的
        int[] arr3 = {1,2,3,4};
        Stream.of(arr3).forEach(System.out::println);

        long count = Stream.of("a1", "a2", "a3").count();
        System.out.println(count);


        Stream.of("a1", "a2", "a3","bb","cc","aa1","dd")
                .filter((s)->s.contains("1"))
                .forEach(System.out::println);


        Map<Integer, Object> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(12);
        list.add(13);

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");
        map1.put(5, "E");
      /*  for (Integer integer : list) {
            System.out.println(integer);

        }
        list.forEach(System.out::println);*/
//        list.stream().filter(s ->s.compareTo(1)).forEach(System.out::println);

        list.stream().filter(s -> s > 2).forEach(System.out::println);



/*        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(num -> num > 2)
                .collect(Collectors.toList());

        filteredNumbers.forEach(System.out::println);*/

//        System.out.println(list);


/*        System.out.println(map);
        System.out.println(map.keySet());
*//*        Stream<Integer> stream = map.keySet().stream();
                stream.forEach(System.out::println); // key*//*

        map.keySet().stream().forEach(System.out::println); // key

        Stream<Object> stream1 = map.values().stream(); // value
        stream1.forEach(System.out::println);*/
//        map.entrySet().stream().filter(s ->s.getValue().equals(b)).forEach(System.out::println);

//        map.entrySet().stream().filter(s ->s.getKey().equals(2)).forEach(System.out::println);
        map.entrySet().stream().filter(s ->s.getValue().equals("b")).forEach(System.out::println);


//        map.entrySet().forEach(f -> System.out.println(f));


      /*  Stream<Map.Entry<Integer, Object>> stream2 = map.entrySet().stream(); // entry


        stream2.forEach(System.out::println);
*/



        map1.entrySet().stream()
                .filter(entry -> entry.getKey() > 2)
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        String aa ="nishizhuygg1";
        System.out.println(aa.startsWith("ni"));

        String st1 = "dasadayggs";

        System.out.println("st1:"+st1.startsWith("ygg",6));



        List<Person> list22 = new ArrayList<>();
        list22.add(new Person("马化腾",25,3000));
        list22.add(new Person("李彦宏",27,2545));
        list22.add(new Person("雷军",35,4515));
        list22.add(new Person("马云",55,9877));
        // 把年龄大于30岁的人，转成一个list集合
        List<Person> collect = list22.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        // 遍历输出（输出雷军和马云）
        for (Person person : collect) {
            System.out.println(person);
        }

        System.out.println("----------");

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("马化腾",25,3000));
        list2.add(new Person("李彦宏",27,2545));
        list2.add(new Person("雷军",35,4515));
        list2.add(new Person("马云",55,9877));
        // 把姓马的人，转成Set集合
        Set<Person> set = list2.stream().filter(person -> person.getName().startsWith("马")).collect(Collectors.toSet());
        // 输出马云和马化腾
        set.forEach(System.out::println);



    }


}



