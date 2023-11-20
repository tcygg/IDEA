package com.msb.ceshi;

import ch.qos.logback.core.spi.LogbackLock;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.invoke.MethodHandles.lookup;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/16 - 11 - 16 - 12:47
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class ceshi {
//    static final Logger logger = getLogger(lookup().lookupClass());

    private static final Logger logger = getLogger(ceshi.class);

    public int add(int a,int b){
        int c =a+b;
        return c;

    }


    public static void main(String[] args) {
        System.out.println(111);


//        Logger logger = LoggerFactory.getLogger(ceshi.class);




        logger.info("第二111次打印日志");


    }
}
