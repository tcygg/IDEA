package com.msb.ceshi;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/20 - 11 - 20 - 14:52
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
class ceshiTest {

    @Test
    void add() {
        ceshi ceshi = new ceshi();
        int bbb = ceshi.add(1, 2);
        System.out.println(bbb);
    }

    @Test
    void testFindAll() {
        Logger logger = LoggerFactory.getLogger(ceshiTest.class);
        logger.info("wojiushi");

    }
}