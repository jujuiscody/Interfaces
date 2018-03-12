package com.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspect.service.FactoryService;
import com.aspect.service.ShapeService;

public class AspectAppMain {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("springAspect.xml");
		FactoryService factory = new FactoryService();
		ShapeService shapeService = (ShapeService)factory.getBean("shape");
		//System.out.println(shapeService.getCircle().getName());
		//System.out.println(shapeService.getTriangle().getName());
		//shapeService.getTriangle().setName("isoceles");
		shapeService.getCircle();
		//shapeService.getTriangle().setName("fanny");
	}

}
