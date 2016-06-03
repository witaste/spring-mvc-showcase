package org.springframework.common.context;

import java.util.Date;

import javax.servlet.ServletContext;

import org.springframework.common.constants.ApplicationConstants;
import org.springframework.web.context.ServletContextAware;

public class GServletContext implements ServletContextAware {

	private ServletContext servletContext;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext; 
        getServletContext().setAttribute("resouceVersion", new Date().getTime());
        getServletContext().setAttribute("swaggerPath", ApplicationConstants.SWAGGER_PATH);
	}
	
	public ServletContext getServletContext() {  
        return servletContext;  
    }  
}
