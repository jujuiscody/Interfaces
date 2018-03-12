package com.aspect.service;

import com.aspect.model.Circle;
import com.aspect.model.Triangle;

public class FactoryService {
	
	public Object getBean(String beanName) {
		if(beanName.equals("shape")) return new ShapeServiceProxy();
		if(beanName.equals("circle")) return new Circle();
		if(beanName.equals("triangle")) return new Triangle();
		return null;
		
	}

}
