package com.ygg.servletdome1;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/18 - 02 - 18 - 17:19
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
public class ServletMap01 extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*Enumeration<String> headerNames = req.getHeaderNames();

        System.out.println("hah" + headerNames);


        while (headerNames.hasMoreElements()) {
            String headername = headerNames.nextElement();
            System.out.println(headername + ":" + req.getHeader(headername));
        }


        Enumeration<String> parameterNames = req.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String hh = parameterNames.nextElement();
            System.out.println(hh + ":" + req.getParameter(hh));
        }
*/
        req.setCharacterEncoding("UTF-8");


        System.out.println("---------------------");

        Map<String, String[]> parameterMap = req.getParameterMap();
        parameterMap.forEach((key,value)-> {
            if(value.length==1){
                System.out.println(key+":"+value[0]);
                System.out.println(key+":"+Arrays.toString(value));


            }else {
                System.out.println(key+":"+Arrays.toString(value));

            }
      /*      System.out.println(key);
//            Stream.of(value).forEach(System.out::println);
            System.out.println(Arrays.toString(value));

            System.out.println(value.length);
//            System.out.println(Arrays.toString(value).getClass());*/

        });

        System.out.println("---------------------");




            for (Map.Entry<String, String[]> stringEntry : parameterMap.entrySet()) {
                System.out.println(stringEntry.getKey());
//                System.out.println(stringEntry.getValue());

                System.out.println(Arrays.toString(stringEntry.getValue()));

            }



//            resp.setStatus(200);
        resp.setHeader("Content-Type","text/html;charset=UTF-8");

//        resp.setHeader("Content-Type","application/json");


//        resp.setHeader("Content-Type","application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");



//            resp.setContentType("application/json");


        PrintWriter writer = resp.getWriter();
        writer.write("<h1>nishizhu张扬生哥呀</h1>");




    };

    }

