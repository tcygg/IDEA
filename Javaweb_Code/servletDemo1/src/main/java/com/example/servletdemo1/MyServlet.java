package com.example.servletdemo1;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @Auther: TcYgg
 * @Date: 2024/2/8 - 02 - 08 - 17:12
 * @Description: com.example.servletdemo1
 * @version: 1.0
 */
public class MyServlet extends HttpServlet {
    /*
     * 可以接收浏览器的请求
     * 并作出运算和响应
     * service Servlet服务方法
     *
     * */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 动态生成数据
        int num =new Random().nextInt();
        String message = num%2==0?"happy birthday":"happy new year";
        // 对浏览器作出响应
        PrintWriter writer = response.getWriter();// 该打印流指向了浏览器
        writer.write(message);
        writer.write(num);

    }
}