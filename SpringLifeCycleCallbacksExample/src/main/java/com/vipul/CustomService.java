package com.vipul;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class CustomService implements InitializingBean, DisposableBean {

	@PostConstruct
	public void customConstructMethod(){
		System.out.println(" This line is executed from @PostConstruct customConstructMethod()");		
	}
	
	public void init(){
		System.out.println(" This line is executed from init()");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(" This line is executed from afterPropertiesSet()");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println(" This line is executed from destroy()");				
	}

	@PreDestroy
	public void customDestroyMethod(){
		System.out.println(" This line is executed from @PreDestroy customDestroyMethod()");		
	}

	public void cleanup(){
		System.out.println(" This line is executed from cleanup()");		
	}
}
