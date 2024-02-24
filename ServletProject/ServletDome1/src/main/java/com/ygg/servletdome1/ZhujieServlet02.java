package com.ygg.servletdome1;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/21 - 02 - 21 - 17:15
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */

@WebServlet(
        urlPatterns = {"/ZhujieServlet02.do"}


)
public class ZhujieServlet02 extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("翻江倒海房间号第三方");


        String str = req.getParameter("money");

        System.out.println("money:"+str);


        PrintWriter writer = resp.getWriter();
        writer.println("支付宝到账:"+str+"元");
    }
}
