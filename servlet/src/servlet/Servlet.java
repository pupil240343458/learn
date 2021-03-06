package servlet;

import bean.javaBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pupil on 2016/3/3.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        javaBean user=new javaBean();
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM--dd HH:mm:ss");
        user.setDate(date.format(new Date()));
        try{
            request.setCharacterEncoding("utf-8");
            user.setIntersts(request.getParameterValues("interest"));
            user.setPassWord(request.getParameter("passWord"));
            user.setUserName(request.getParameter("name"));
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            request.getSession().setAttribute("u",user);
            request.getRequestDispatcher("../testServlet.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
