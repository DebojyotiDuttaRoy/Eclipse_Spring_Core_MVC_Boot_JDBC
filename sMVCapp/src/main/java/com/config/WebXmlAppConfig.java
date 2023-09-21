package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebXmlAppConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class<?> classArr[]= {SpringAppConfig.class};
		return classArr;
	}

	@Override
	protected String[] getServletMappings() {
	/*	String arrMap[]= {"/wc.com/*"};
		return arrMap;	*/
		return new String[] {"/"};
	}
	
}
