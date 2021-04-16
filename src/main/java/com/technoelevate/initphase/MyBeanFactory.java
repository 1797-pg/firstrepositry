package com.technoelevate.initphase;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactory implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition definition=beanFactory.getBeanDefinition("msgBean");
		MutablePropertyValues propertyValues=definition.getPropertyValues();
		propertyValues.addPropertyValue("msg","technoelevate");
		
	}

}
