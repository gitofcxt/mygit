package com;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
@WebListener
public class TestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("¼ÓÔØa.properties");
    	final String s = "/a.properties";
        final Properties p = new Properties();
        try {
			p.load(getClass().getResourceAsStream(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       for (String ss : p.stringPropertyNames()) {
    	   if(System.getProperty(ss)==null){
    		   System.setProperty(ss, p.getProperty(ss));
    	   }
       } 
       System.out.println("+++++++++>>>"+System.getProperty("a"));;
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    	   
    }
	
}
