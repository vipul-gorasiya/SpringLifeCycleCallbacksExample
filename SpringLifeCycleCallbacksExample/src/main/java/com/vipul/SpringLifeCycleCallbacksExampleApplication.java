package com.vipul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringLifeCycleCallbacksExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(SpringLifeCycleCallbacksExampleApplication.class, args);
		CustomService bean = (CustomService) applicationContext.getBean("customService");
		CustomService bean2 = (CustomService) applicationContext.getBean("customService2");
		applicationContext.getBeanFactory().destroyBean(bean);
		applicationContext.getBeanFactory().destroyBean(bean2);
	}
	
	@Bean(initMethod="init", destroyMethod="cleanup")
	public CustomService customService2(){
		return new CustomService();
	}
}
