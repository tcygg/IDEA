package com.msb.ceshi;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.util.Base64Utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/6 - 02 - 06 - 19:55
 * @Description: com.msb.ceshi
 * @version: 1.0
 */


@Slf4j
public class BIapiTestChuanCan {

    @Test
    void apiTest() throws UnsupportedEncodingException {

        String appid = "smartbi_api_7d9d4e60fb70c629";
        String appkey = "b045b02377d0427ab112bf8512068502";
        String body="";



        /**
         * 接口请求的时候,将data直接拼到url后面就行,记得加?
         * 如果是是用postman,记得切换请求方式 { 'key': 'Content-Type', 'value' : 'application/x-www-form-urlencoded' }
         * param就是x5接口有哦传参的时候,就添加进去,否则不需要
         * 下面两种传参方案
         */

/*        //方案1:通过map集合添加对象后,用fastjson将mao转成STring
        HashMap<String,String> param = new HashMap<>();
        param.put("学生","小明");
        if(param.isEmpty()){
            body ="";
        }else {
            body = JSON.toJSONString(param);
//            System.out.println(body);
        }*/

/*        //方案2:直接将接口中的请求json复制到下面的string类型字符串中,记得要加换行,idea自动加
        String one = "smartbi_api_7d9d4e60fb70c629";
        String two = "smartbi_api_7d9d4e60fb70c629";

         body = "{\n" +
                "                \"学生\": \"小明\"\n" +
                "}";*/



    String sign = DigestUtils.md5Hex(appid+body+appkey).toUpperCase();



/*
        toUpperCase() 用于将字符串中的所有小写字母转换为大写字母。但是我看写了没写都一样，待验证
*/





        JSONObject jsonObject = new JSONObject();

        JSONObject header = new JSONObject();

        header.put("appid",appid);
        header.put("sign",sign);

        jsonObject.put("header",header);
        jsonObject.put("body",body);


        String data = Base64Utils.encodeToString(jsonObject.toString().getBytes());

        String dataUrl = URLEncoder.encode(data,"UTF-8");


        System.out.println("sign值是：");

        System.out.println(sign);


        System.out.println("data值进行url编码后的值是：");
        System.out.println(dataUrl);




/*    url编码解码的方法
       String url = "http://www.baidu.com?name='张三'&age=18 ";
        String encodeStr = URLEncoder.encode(data,"UTF-8");
        System.out.println(encodeStr);
        System.out.println(URLDecoder.decode(encodeStr,"UTF-8"));
*/

/*  下面是使用fastjson将str转换成java的对象,如果是实体类,就直接写实体类的地址class

        String jsonStr = "{\n" +
                "  \"cityDescribe\": \"宁波是港口城市\",\n" +
                "  \"cityId\": 2023062802,\n" +
                "  \"cityName\": \"宁波\",\n" +
                "  \"updateTime\": \"2023-07-16 13:15:40\"\n" +
                "}";
        System.out.println("====================f2====================");
        JSONObject obj = JSON.parseObject(jsonStr, JSONObject.class);
        System.out.println(obj.get("cityId"));
        System.out.println(obj.get("cityName"));
        System.out.println(obj.get("cityDescribe"));
        System.out.println(obj.get("updateTime"));

*/





    }
}
