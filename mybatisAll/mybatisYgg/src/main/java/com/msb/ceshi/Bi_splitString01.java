package com.msb.ceshi;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/30 - 01 - 30 - 21:08
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class Bi_splitString01 {
    public static void main(String[] args) {

        List<String> sql_string = new ArrayList<>();




        String aa =
                "SELECT yyyymm,factory,create_time,yyyy_mm_dd_hh_mm,yyyy_mm_dd_hh,yyyy_mm,dic_line,yyyy_mm_dd_hh_mm_ss,histogram_line,histogram_date,yyyy_mm_dd,CAST(`int_value_negative` AS BIGINT) as \"int_value_negative\",CAST(`bool_value` AS BIGINT) as \"bool_value\",CAST(`histogram_float` AS DOUBLE) as \"histogram_float\",CAST(`histogram_int` AS BIGINT) as \"histogram_int\",CAST(`yyyymmdd` AS BIGINT) as \"yyyymmdd\",CAST(`yyyy` AS BIGINT) as \"yyyy\",CAST(`float_value_percent` AS DOUBLE) as \"float_value_percent\",CAST(`float_value_negative` AS DOUBLE) as \"float_value_negative\",CAST(`id` AS BIGINT) as \"id\" FROM (select * from qinzhen_1222) as t_1c46f3f38dff7b1c WHERE 1=1 AND (DATE_FORMAT(CONCAT(yyyymm, '-01'), '%Y-%m') = '2023-10' ) LIMIT 20 "
                ;


        String bb =
                "SELECT `FACTORY` as \"FACTORY\",`YYYY_MM` as \"YYYY_MM\",SUM(SIMPLE_INT_TWO) as \"SUM(`SIMPLE_INT_TWO`)\",SUM(SIMPLE_INT_ONE) as \"SUM(`SIMPLE_INT_ONE`)\" FROM (select ID,FACTORY,SIMPLE_INT_ONE,SIMPLE_INT_TWO,`YYYY`,YYYYMM,YYYY_MM,YYYYMMDD,YYYY_MM_DD,Y_M_D_H,Y_M_D_H_M,Y_M_D_H_M_S,remark_yg02 from ygg_diydate_01) as t_1c46f3f38dff7b1c WHERE 1=1 AND (DATE_FORMAT(STR_TO_DATE(YYYY_MM, '%Y-%m'), '%Y-%m') > '2024-01' ) GROUP BY `FACTORY`,`YYYY_MM` HAVING 1=1 LIMIT 50"
                ;

        String cc =
                "SELECT `FACTORY` as \"FACTORY\",`YYYY_MM` as \"YYYY_MM\",SUM(SIMPLE_INT_TWO) as \"SUM(`SIMPLE_INT_TWO`)\",SUM(SIMPLE_INT_ONE) as \"SUM(`SIMPLE_INT_ONE`)\" FROM (select ID,FACTORY,SIMPLE_INT_ONE,SIMPLE_INT_TWO,`YYYY`,YYYYMM,YYYY_MM,YYYYMMDD,YYYY_MM_DD,Y_M_D_H,Y_M_D_H_M,Y_M_D_H_M_S,remark_yg02 from ygg_diydate_01) as t_1c46f3f38dff7b1c WHERE 1=1 AND (DATE_FORMAT(STR_TO_DATE(YYYY_MM, '%Y-%m'), '%Y-%m') > '2024-01' ) GROUP BY `FACTORY`,`YYYY_MM` HAVING 1=1 LIMIT 50"
                ;


        sql_string.add(aa);
        sql_string.add(bb);
        sql_string.add(cc);


//        sql_string.stream().forEach(System.out::println);

        try {



        sql_string.stream().filter(s -> s.split("WHERE 1=1 AND")[1].contains("=")).forEach(s -> System.out.println(s.split("WHERE 1=1 AND")[1]));

        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("没多大问题就是后面的string长度不够");
        }
        catch(Exception ex){
            System.out.println("对不起，程序出现异常！");
        };



//        sql_string.forEach(System.out::println);

        sql_string.forEach(s-> System.out.println(s));

        sql_string.stream().forEach(s-> System.out.println(s));
        sql_string.stream().forEach(s-> System.out.println(s));










//        System.out.println(aa);
//
//
//
//        System.out.println(aa.split("WHERE 1=1 AND")[1]);

    }
}
