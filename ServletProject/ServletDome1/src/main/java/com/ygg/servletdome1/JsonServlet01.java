package com.ygg.servletdome1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

/**
 * @Auther: TcYgg
 * @Date: 2024/3/27 - 03 - 27 - 10:18
 * @Description: com.ygg.servletdome1
 * @version: 1.0
 */

@WebServlet(
        urlPatterns = {"/json.do"}


)
public class JsonServlet01 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        Map<String, String[]> parameterMap = req.getParameterMap();
        parameterMap.forEach((key,value)-> {
            if(key.equals("introduce")){
                System.out.println(key+":"+value[0]);
//                System.out.println(key+":"+ Arrays.toString(value));

                resp.setHeader("Content-Type","text/html;charset=UTF-8");


                PrintWriter writer = null;
                try {
                    writer = resp.getWriter();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                writer.write(value[0]);

            }else {



            }
        });

/*        Map<String, String[]> parameterMap = req.getParameterMap();
        parameterMap.forEach((key,value)-> {
            if(value.length==1){
                System.out.println(key+":"+value[0]);
//                System.out.println(key+":"+ Arrays.toString(value));


            }else {
//                System.out.println(key+":"+Arrays.toString(value));

            }
        });*/



/*        for (Map.Entry<String, String[]> stringEntry : parameterMap.entrySet()) {
            System.out.println(stringEntry.getKey());
//                System.out.println(stringEntry.getValue());

            System.out.println(Arrays.toString(stringEntry.getValue()));

        }*/


//            resp.setStatus(200);





    };
}
