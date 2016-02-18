package com.mkyong.servlet3;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.mkyong.config.SpringRootConfig;
import com.mkyong.config.SpringWebConfig;


/*
AbstractAnnotationConfigDispatcherServletInitializer is an implementation of WebApplicationInitializer 

A good read up of it is here :
http://joshlong.com/jl/blogPost/simplified_web_configuration_with_spring.html

 */
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { SpringRootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
		servletContext.setInitParameter("spring.profiles.active", "hsql");
	}

}