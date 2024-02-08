package com.ygg.servletdome1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/8 - 02 - 08 - 19:47
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("login servlet invoked");
        // 获取请求中的数据
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        // 判断数据
        String message=null;
        if(username.equals("mashibing")&& pwd.equals("123456")){
            message="Success";
        }else{
            message="Fail";
        }
        // 作出响应
        resp.getWriter().write(message);
    }
}

