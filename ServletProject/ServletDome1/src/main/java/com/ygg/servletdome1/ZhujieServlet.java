package com.ygg.servletdome1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/20 - 02 - 20 - 19:24
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */

@WebServlet(name = "ZhujieServlet.do",
        urlPatterns = {"/ZhujieServlet.do", "/a.do", "/b.do"},
        loadOnStartup = -1,

        initParams = {
                @WebInitParam(name = "key1", value = "value1"),
                @WebInitParam(name = "key2", value = "value2")

        }


)
public class ZhujieServlet extends HttpServlet {

    public ZhujieServlet(){
        System.out.println("构造函数");
    }


    @Override
    public void init() throws ServletException {
        System.out.println("init方法初始化调用");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("几殴打返回");
        ServletConfig servletConfig = this.getServletConfig();
        String key2 = servletConfig.getInitParameter("key2");
        System.out.println(key2);


        String str = req.getParameter("money");

        System.out.println("money:"+str);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("ZhujieServlet02.do");



        requestDispatcher.forward(req,resp);
    }
}
