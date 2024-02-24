package com.ygg.servletdome1;

import java.sql.SQLOutput;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/23 - 02 - 23 - 14:20
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
public class daying01 {
    public static void main(String[] args) {


        String aa =
                "SELECT \"address_1\" as \"address_1\",\"name\" as \"name\",\"bool\" as \"bool\",\"time\" as \"time\",CAST(NULLIF(TRIM(\"time1\"::VARCHAR), '')::NUMERIC AS BIGINT) as \"time1\",NULLIF(TRIM(\"time2\"::VARCHAR), '')::NUMERIC as \"time2\",CAST(NULLIF(TRIM(\"times\"::VARCHAR), '')::NUMERIC AS BIGINT) as \"times\",CAST(NULLIF(TRIM(\"id\"::VARCHAR), '')::NUMERIC AS BIGINT) as \"id\" FROM (select * from alert_test_wanghao57 where id >400) as t_1c46f3f38dff7b1c WHERE 1=1 AND ( REPLACE(address_1,' ','') = '' or REPLACE (address_1,' ','') != '') LIMIT 100 "
                ;








        System.out.println(aa);






    }







}


