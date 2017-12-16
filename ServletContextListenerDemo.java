package com.day4;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
//@WebListener("ServletContextListenerDemo")
public class ServletContextListenerDemo implements ServletContextListener
{

	@Override
	public void contextDestroyed(ServletContextEvent obj) 
	{
		System.out.println("Object destroyed");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent obj) 
	{
		
		ServletContext ctx=obj.getServletContext();
		ctx.setAttribute("admin", "admin@gmail.com");
		
	}

}
