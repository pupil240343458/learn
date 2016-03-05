package HelloServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by pupil on 2016/2/29.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理get请求");
        PrintWriter out =resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");
        out.println("<strong>HelloServlet<strong>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理post请求");
        PrintWriter out =resp.getWriter();
        resp.setContentType("text/html;charset=utf-8");
        out.println("<strong>HelloServlet<strong>");
    }
}
