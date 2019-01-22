package org.zdxue.web.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author zdxue
 */
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Enumeration<String> enumeration = filterConfig.getInitParameterNames();
        for (; enumeration.hasMoreElements(); ) {
            String key = enumeration.nextElement();
            String value = filterConfig.getInitParameter(key);
            System.out.println("FirstFilter::" + key + ":" + value);
        }
        System.out.println("FirstFilter init...");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FirstFilter doFilter...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
