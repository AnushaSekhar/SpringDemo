package org.Spring.Test;

public class TriangleWithPoints {

	private Points pointA;
	private Points pointB;
	private Points pointc;
	public Points getPointA() {
		return pointA;
	}
	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	public Points getPointB() {
		return pointB;
	}
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	public Points getPointc() {
		return pointc;
	}
	public void setPointc(Points pointc) {
		this.pointc = pointc;
	}
	
	public void draw(){
		System.out.println("Point A= (" +getPointA().getX() + "," +getPointA().getY() +")");
		System.out.println("Point B= (" +getPointB().getX() + "," +getPointB().getY() +")");
		System.out.println("Point C= (" +getPointc().getX() + "," +getPointc().getY() +")");
	}
}
