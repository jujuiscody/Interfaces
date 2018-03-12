package com.aspect.service;

import com.aspect.aspectService.Loggable;
import com.aspect.model.Circle;
import com.aspect.model.Triangle;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
@Loggable
	public Circle getCircle() {
	System.out.println("calling getter method");
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
