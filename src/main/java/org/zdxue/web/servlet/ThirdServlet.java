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
public class ThirdServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        Enumeration<String> enumeration = config.getInitParameterNames();
        for (; enumeration.hasMoreElements(); ) {
            String key = enumeration.nextElement();
            String value = config.getInitParameter(key);
            System.out.println("ThirdServlet::" + key + ":" + value);
        }
        System.out.println("ThirdServlet init...");
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
        System.out.println("ThirdServlet::handleRequest...");
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
