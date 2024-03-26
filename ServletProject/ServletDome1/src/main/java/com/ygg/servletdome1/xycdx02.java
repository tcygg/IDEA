package com.ygg.servletdome1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: TcYgg
 * @Date: 2024/3/25 - 03 - 25 - 11:00
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
@WebServlet(
        urlPatterns = {"/xycdx02.do","/nishizhu02.do"},
        loadOnStartup = 6,
        initParams = {
                @WebInitParam(name = "key1", value = "value1"),
                @WebInitParam(name = "key2", value = "value2")

        }

)
public class xycdx02 extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("被重定向响应了");


        /*
        http://localhost:8080/ServletDome1_war_exploded/xycdx02.do?money=1000
        */

    }
}
