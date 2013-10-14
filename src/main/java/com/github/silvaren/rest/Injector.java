package com.github.silvaren.rest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Injector implements ApplicationContextAware {

	private static ApplicationContext appContext;

	// Private constructor prevents instantiation from other classes
	private Injector() {
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		appContext = applicationContext;

	}

	public static ApplicationContext getApplicationContext() {
		return appContext;
	}

	public static Object getBean(String beanName) {
		return appContext.getBean(beanName);
	}

}
