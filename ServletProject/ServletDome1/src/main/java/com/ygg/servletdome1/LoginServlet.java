package com.ygg.servletdome1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/8 - 02 - 08 - 19:47
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        /*处理post请求乱码*/
        req.setCharacterEncoding("utf-8");//处理控制台打印日志乱码
        resp.setHeader("Content-Type","text/html;charset=UTF-8");//处理游览器返回结果乱码

        // 获取请求中的数据
        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");

        // 判断数据
        String message= null;
        if(username.equals("mashibing")&& pwd.equals("123456")){
            message="Success";
        }else{
            message="Fail";
        }
        // 作出响应
        resp.getWriter().write(message);
        resp.getWriter().write(username);
        resp.getWriter().write(pwd);

        resp.getWriter().write("-----------------------------------------------");



        StringBuffer requestURL = req.getRequestURL();//返回客户端浏览器发出请求时的完整URL。
        String requestURI = req.getRequestURI();//返回请求行中指定资源部分。
        String remoteAddr = req.getRemoteAddr();//返回发出请求的客户机的IP地址。
        String localAddr = req.getLocalAddr();//返回WEB服务器的IP地址。


        int localPort = req.getLocalPort();//返回WEB服务器处理Http协议的连接器所监听的端口。

        resp.getWriter().write(String.valueOf(requestURL));

        resp.getWriter().write("1-------------------");
        resp.getWriter().write("返回请求行中指定资源部分"+requestURI+"返回发出请求的客户机的IP地址。"+remoteAddr+"返回WEB服务器的IP地址。"+localAddr+"返回WEB服务器处理Http协议的连接器所监听的端口。"+localPort);


        System.out.println( "返回请求行中指定资源部分"+requestURI+"返回发出请求的客户机的IP地址。"+remoteAddr+"返回WEB服务器的IP地址。"+localAddr+"返回WEB服务器处理Http协议的连接器所监听的端口。"+localPort);

        resp.getWriter().write("1打出1111-------------------");

        String headerValue = req.getHeader("Cookie");//取不到的时候就返回null
        System.out.println(headerValue);
        System.out.println("主机名: " + req.getLocalName());
        System.out.println("客户端PORT: " + req.getRemotePort());
        System.out.println("当前项目部署名: " + req.getContextPath());
        System.out.println("协议名:"+req.getScheme());
        System.out.println("请求方式:"+req.getMethod());

        // 根据请求头名或者请求头对应的值
        System.out.println(req.getHeader("Accept"));
        System.out.println("111111211");

        Enumeration<String> headerNames1 = req.getHeaderNames();


        while (headerNames1.hasMoreElements()){
            String s = headerNames1.nextElement();
            System.out.println(s+"---"+req.getHeader(s));

        }
            ;


        // 获得全部的请求头名
        Enumeration<String> headerNames = req.getHeaderNames();


//        System.out.println("hah"+headerNames);


        while (headerNames.hasMoreElements()) {
            String headername = headerNames.nextElement();
            System.out.println(headername + ":" + req.getHeader(headername));
        }


        String str = req.getParameter("username");



        System.out.println(str+"yanggg");
        Enumeration<String> parameterNames = req.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String hh = parameterNames.nextElement();
            System.out.println(hh + ":" + req.getParameter(hh));
            PrintWriter writer = resp.getWriter();
            writer.print(hh + ":" + req.getParameter(hh));
        }






        }
}

