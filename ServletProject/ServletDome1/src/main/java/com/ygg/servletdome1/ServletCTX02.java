package com.ygg.servletdome1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/19 - 02 - 19 - 16:40
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
public class ServletCTX02 extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        // 获取web.xml中配置的全局的初始信息
        Enumeration<String> pnames = servletContext.getInitParameterNames();
        while(pnames.hasMoreElements()){
            String e = pnames.nextElement();
            System.out.println(e+":"+servletContext.getInitParameter(e));
        }
        List<String> list = (List<String>) servletContext.getAttribute("list");
        System.out.println(list);
        String gender = (String)servletContext.getAttribute("gender");
        System.out.println(gender);
    }
}
