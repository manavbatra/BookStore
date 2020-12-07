package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


@WebListener
public class AnalyticsListener implements HttpSessionAttributeListener {

    
    public AnalyticsListener() {
        // TODO Auto-generated constructor stub
    }
	
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }


    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 

    }

	
}