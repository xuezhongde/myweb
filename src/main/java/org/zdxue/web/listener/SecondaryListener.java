package org.zdxue.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Enumeration;

/**
 * @author zdxue
 */
public class SecondaryListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Enumeration<String> enumeration = servletContextEvent.getServletContext().getInitParameterNames();
        for (; enumeration.hasMoreElements(); ) {
            String key = enumeration.nextElement();
            String value = servletContextEvent.getServletContext().getInitParameter(key);
            System.out.println("SecondaryListener::" + key + ":" + value);
        }
        System.out.println("SecondaryListener init...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
