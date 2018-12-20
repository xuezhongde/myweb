package org.zdxue.web.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author zdxue
 */
public class FirstServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        Enumeration<String> enumeration = config.getInitParameterNames();
        for (; enumeration.hasMoreElements(); ) {
            String key = enumeration.nextElement();
            String value = config.getInitParameter(key);
            System.out.println("FirstServlet::" + key + ":" + value);
        }
        System.out.println("FirstServlet init...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handleRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        handleRequest(req, resp);
    }

    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FirstServlet::handleRequest...");

        System.out.println("isSecure: " + req.isSecure());
        System.out.println("Scheme: " + req.getScheme());
        System.out.println("ServletPath: " + req.getServletPath());
        System.out.println("ContextPath: " + req.getContextPath());
        System.out.println("PathInfo: " + req.getPathInfo());
        System.out.println("RequestedSessionId: " + req.getRequestedSessionId());
        System.out.println("RequestURI: " + req.getRequestURI());
        System.out.println("RequestURL: " + req.getRequestURL());
        System.out.println("DispatcherType: " + req.getDispatcherType());
        System.out.println("Method: " + req.getMethod());

        //resp.sendRedirect("baidu.com"); //重定向(相对位置)
        //resp.sendRedirect("http://baidu.com"); //重定向(绝对位置)
        resp.sendRedirect("ade.do"); //重定向(相对位置)到ade.do
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
