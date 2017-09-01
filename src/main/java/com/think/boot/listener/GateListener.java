package com.think.boot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class GateListener
 *
 */
public class GateListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public GateListener() {
		// TODO Auto-generated constructor stub
		System.out.println("construct gatelistener");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

		System.out.println("destroy gatelistener");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("init gatelistener");
	}

}
