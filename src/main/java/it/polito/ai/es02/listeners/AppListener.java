package it.polito.ai.es02.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hibernate.SessionFactory;

import it.polito.ai.es02.model.HibernateUtil;
import it.polito.ai.es02.services.LinesService;
import it.polito.ai.es02.services.LinesServiceImpl;

/**
 * Application Lifecycle Listener implementation class AppListener
 *
 */
@WebListener
public class AppListener implements ServletContextListener {

	public static final String CONTEXT_ATTRIBUTE_LINES_SERVICE= "linesService";
	
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	LinesService linesService = new LinesServiceImpl(sessionFactory);
    	arg0.getServletContext().setAttribute(CONTEXT_ATTRIBUTE_LINES_SERVICE, linesService);
    }
	
}
