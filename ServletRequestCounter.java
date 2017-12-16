package com.day4;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletRequestCounter implements ServletRequestListener
{
	static int counter;

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("Request Destroyed");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		counter++;
		
	}
	public static int requestCounter()
	{
		return counter;
	}
}
