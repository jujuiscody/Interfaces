package com.aspect.service;

import com.aspect.aspectService.LoggingAspect;
import com.aspect.model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		
		new LoggingAspect().loggingAdvice();
		
	  return	super.getCircle();

		}
	
	
}
