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
        urlPatterns = {"/xycdx01.do","/nishizhu.do"},
//        loadOnStartup = 6,
        initParams = {
                @WebInitParam(name = "key1", value = "value1"),
                @WebInitParam(name = "key2", value = "value2")

        }

)
public class xycdx01 extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        System.out.println("xycdx01 service invoked");
        String money = req.getParameter("money");
        System.out.println("money:"+money);
        // 响应重定向
        resp.sendRedirect("xycdx02.do?money="+money);


//        resp.sendRedirect("https://www.baidu.com");

        //resp.sendRedirect("WEB-INF/bbb.html");
        //resp.sendRedirect("https://www.baidu.com");
        /*
         * 响应重定向总结
         * 1重定向是服务器给浏览器重新指定请求方向 是一种浏览器行为 地址栏会发生变化
         * 2重定向时,请求对象和响应对象都会再次产生,请求中的参数是不会携带
         * 3重定向也可以帮助我们完成页面跳转
         * 4重定向不能帮助我们访问WEB-INF中的资源
         * 5重定向可以定向到外部资源
         *
         * */

    }
}
