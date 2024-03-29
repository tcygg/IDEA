package com.msb.ceshi;

import com.msb.pojo.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: TcYgg
 * @Date: 2023/11/20 - 11 - 20 - 19:37
 * @Description: com.msb.ceshi
 * @version: 1.0
 */
public class ceshiTest {
    private SqlSession sqlSession;
    @BeforeEach
    public void init(){
        SqlSessionFactoryBuilder ssfb =new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory factory=ssfb.build(resourceAsStream) ;
        sqlSession=factory.openSession();
    }
    @Test
    public void testFindAll(){
        Logger logger = LoggerFactory.getLogger(ceshiTest.class);

        // 调用SQL语句
        List<Dept> list = sqlSession.selectList("findAll");
        for (Dept dept : list) {
            System.out.println(dept);
            logger.info("测试一下mybatis01");

        }
    }
    @AfterEach
    public void release(){
        // 关闭SQLSession
        sqlSession.close();
    }

}
