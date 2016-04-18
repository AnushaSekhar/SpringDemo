package org.Spring.Test;

import java.util.List;

public class CollectionsExample {

private List<Points> points;

public List<Points> getPoints() {
	return points;
}

public void setPoints(List<Points> points) {
	this.points = points;
}
	public void draw(){
		for(Points point:points){
			System.out.println("Points :("+point.getX()+","+point.getY()+")");
		}
	}
	
}
