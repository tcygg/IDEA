package com.msb.ceshi;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Auther: TcYgg
 * @Date: 2024/1/12 - 01 - 12 - 16:17
 * @Description: com.msb.ceshi
 * @version: 1.0
 */

@Slf4j
public class cehiygg001 {
    @Test
    public void cehhi1() {

//        Thread thread = new Thread(s-> System.out.println("dki"));
        System.out.println("SELECT\n      \"lxk_test6\".factory \"lxk_test6__factory\", count(distinct \"lxk_test6\".num2) \"lxk_test6__count_distinct_num2\"\n    FROM\n      (select * from lxk_test1_0927 where 1 = 1) AS \"lxk_test6\"  GROUP BY 1 ORDER BY 2 DESC LIMIT 1000");

    }


}
