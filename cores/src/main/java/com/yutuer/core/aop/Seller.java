package com.yutuer.core.aop;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Seller{
	private Logger logger = Logger.getLogger(Seller.class);
	
	public void greetTo(String name) {
		logger.info("Seller greet to :" + name);
	}
}