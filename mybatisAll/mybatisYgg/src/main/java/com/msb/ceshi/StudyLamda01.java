package com.msb.ceshi;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/12 - 01 - 12 - 16:01
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class StudyLamda01 {


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

            System.out.println(collect.getClass());
            System.out.println("----------");

       /* List<Person> list2 = new ArrayList<>();
        list2.add(new Person("马化腾",25,3000));
        list2.add(new Person("李彦宏",27,2545));
        list2.add(new Person("雷军",35,4515));
        list2.add(new Person("马云",55,9877));
        // 把姓马的人，转成Set集合
        Set<Person> set = list2.stream().filter(person -> person.getName().startsWith("马")).collect(Collectors.toSet());
        // 输出马云和马化腾
        set.forEach(System.out::println);



*/

            String[] arrs1 = {"11","aa22","aa33","aa11","aa11"};

            String[] arrs2 = {"11","22","33","11"};

            Stream<String> ss =Stream.of(arrs1);

//        ss.forEach(System.out::println);
//        () -> ss(s -> Integer.parseInt(ss))
//        ss.forEach(s -> System.out.println(Integer.parseInt(s)));

//        ss.map(s -> Integer.parseInt(s)).forEach(System.out::println);

//        ss.map(s -> Double.parseDouble(s)).forEach(System.out::println);

//        Long aaa =ss.filter(s -> s.equals("11")).count();


//                ss.filter(s -> s.startsWith("aa")).collect(Collectors.toList()).forEach(System.out::println);


//        List<String> listaaa = ss.filter(s -> s.startsWith("aa")).collect(Collectors.toList());


            Set<String> listaaa = ss.filter(s -> s.startsWith("aa")).collect(Collectors.toSet());


//        List<String> listaaa = ss.filter(s -> s.startsWith("aa")).collect(Collectors.toList());



            listaaa.forEach(System.out::println);
            System.out.println(listaaa);




//        System.out.println(aaa);



//        System.out.println(ss.getClass());



            String[] arrName = {"zhangsan,28","周杰伦,89","许嵩,33","王菲,29","jack,13"};


//        Arrays.stream(arrName).filter();

//        Stream.of(arrName).filter(s -> Integer.parseInt(s.split(",")[1])>1).forEach(System.out::println);


            List<String> accb =Stream.of(arrName).filter(s -> Integer.parseInt(s.split(",")[1])>1).collect(Collectors.toList());

            System.out.println(accb.get(0));


//        Arrays.stream(arrName).collect(Collectors.toList()).forEach(System.out::println);

            List<String> bba = Arrays.stream(arrName).collect(Collectors.toList());

            System.out.println(bba);



/*        String aba ="wohaha,aa";
        System.out.println(aba.split(","));*/


//        System.out.println(arrName[1].split(","));

//        String [] DD = arrName[1].split(",");

/*        for (String s : DD) {
            System.out.println(s);

        }*/
//        if (Integer.parseInt(DD[1])>1111){
//            System.out.println("nishizhu1");
//        }else {System.out.println("cuowu");}


//        System.out.println(DD[0]);
       /* Stream<String> ygg = Stream.of(arrName);
        ygg.filter()*/




            String[] arrName22 = {"zhangsan,28","周杰伦,89","许嵩,33","王菲,29","jack,13"};

            Map<String,Integer> ceshiMap =Arrays.stream(arrName22).collect(Collectors.toMap(

                    s->s.split(",")[0],
                    s -> Integer.parseInt(s.split(",")[1])
            ));

            System.out.println(ceshiMap.keySet());

//        ceshiMap.forEach(s-> System.out.println(s));


/*        ceshiMap.forEach((key,value)->{
            System.out.println(key+"="+value);
//            System.out.println(value);
        });*/


            ceshiMap.entrySet().stream().forEach((Map.Entry<String, Integer> entry) -> {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            });


  /*      Arrays.stream(arrName22).collect(Collectors.toMap(

                s->s.split(",")[0],
                s -> Integer.parseInt(s.split(",")[1])
        )).forEach((Map.Entry<String, Integer> entry) ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });*/

            ceshiMap.forEach((key,value)->System.out.println(key+" : "+value));

       /* public static void forEach_map(Map<Integer,String> map){
            System.out.println("map.forEach(BiConsumer action)方法遍历map");
            map.forEach((key,value) -> System.out.println(key+" : "+value));

        }*/
            System.out.println("---------------");

            System.out.println(ceshiMap.entrySet());

            Set<Map.Entry<String, Integer>> entries = ceshiMap.entrySet();

            for (Map.Entry<String, Integer> stringIntegerEntry : ceshiMap.entrySet()) {
                System.out.println(stringIntegerEntry);

            }


            System.out.println(ceshiMap);

            System.out.println(ceshiMap.keySet());

            for (String woshi:ceshiMap.keySet()) {
                System.out.println(woshi+":"+ceshiMap.get(woshi));

            }


        }


    }




