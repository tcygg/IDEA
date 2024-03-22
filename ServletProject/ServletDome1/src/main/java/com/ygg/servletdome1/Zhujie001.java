package com.ygg.servletdome1;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


/**
 * @Auther: TcYgg
 * @Date: 2024/3/22 - 03 - 22 - 16:30
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */

@WebServlet(
        urlPatterns = {"/zhujie001.do","/lalal.do"},
        loadOnStartup = 6,
        initParams = {
                @WebInitParam(name = "key1", value = "value1"),
                @WebInitParam(name = "key2", value = "value2")

        }

)

public class Zhujie001 extends HttpServlet {


    public Zhujie001(){
        System.out.println("构造函数");
    }


    @Override
    public void init() throws ServletException {
        System.out.println("init方法初始化调用");
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*处理post请求乱码*/
        req.setCharacterEncoding("utf-8");//处理控制台打印日志乱码
//        resp.setHeader("Content-Type","text/html;charset=UTF-8");//处理游览器返回结果乱码

        resp.setHeader("Content-Type","application/json;charset=UTF-8");//处理游览器返回结果乱码



        String aa ="{\n" +
                "                \"order_type_en\": \"ASNGR\\r\",\n" +
                "                \"order_no_num\": \"20240318002\",\n" +
                "                \"SUM(`order_over_nownum`)\": 600,\n" +
                "                \"SUM(`order_plan_all`)\": 1000,\n" +
                "                \"SUM(`delay_rate_all`)\": -0.1,\n" +
                "                \"SUM(`order_delay_nownum`)\": -100\n" +
                "            }";


//        HashMap<String, Integer> aa;



        HashMap<String, Integer> yggmap01 = new HashMap<>();
        yggmap01.put("xuxu",15);
        yggmap01.put("xuxu11",1115);




        ServletConfig servletConfig = this.getServletConfig();
        System.out.println(servletConfig.getInitParameter("key2"));

        String bb11 ="{\n" +
                "    \"code\": 0,\n" +
                "    \"data\": {\n" +
                "        \"cacheKey\": null,\n" +
                "        \"grantProject\": [\n" +
                "            {\n" +
                "                \"bigscreen\": 0,\n" +
                "                \"creator\": \"v-zhangxin21\",\n" +
                "                \"creatorCN\": \"张鑫\",\n" +
                "                \"dataRole\": {\n" +
                "                    \"id\": \"0\",\n" +
                "                    \"name\": \"所有者\"\n" +
                "                },\n" +
                "                \"isAdmin\": 1,\n" +
                "                \"isShortLink\": null,\n" +
                "                \"isShortcut\": null,\n" +
                "                \"projectId\": 2339,\n" +
                "                \"projectName\": \"项目集合YGG-看板\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"loginName\": \"v-zhangxin21\"\n" +
                "    },\n" +
                "    \"message\": \"success\",\n" +
                "    \"tracerId\": \"8ad2a44b1fede2a2\",\n" +
                "    \"heraTracerId\": \"3403bce5745dfb74e421c8e1105aed56\"\n" +
                "}";


        JSONObject entries = JSONUtil.parseObj(bb11);


//        System.out.println(bb11);

        System.out.println(entries.getStr("tracerId"));


        String jsonStr22 = JSONUtil.toJsonStr(entries);

//        String jsonPrettyStr = JSONUtil.toJsonPrettyStr(yggmap01);


        resp.getWriter().write(jsonStr22);
    }
}
