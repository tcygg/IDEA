package com.msb.ceshi;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.json.Json;
import org.springframework.util.Base64Utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/6 - 02 - 06 - 19:55
 * @Description: com.msb.ceshi
 * @version: 1.0
 */


@Slf4j
public class BIapiTest {

    @Test
    void apiTest() throws UnsupportedEncodingException {

        String appid = "smartbi_api_7d9d4e60fb70c629";
        String appkey = "b045b02377d0427ab112bf8512068502";
        HashMap<String,String> param = new HashMap<>();

//        param.put("kd","hdj");

        String body;

        if(param.isEmpty()){
            body ="";

        }else {
            body = JSON.toJSONString(param);
//            System.out.println(body);



        }



//        System.out.println(body);

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


    }
}
