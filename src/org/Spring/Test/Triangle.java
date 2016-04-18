package org.Spring.Test;

public class Triangle {

	private String type;
	private int height;
	public int getHeight() {
		return height;
	}

	//Two constructors defined with diff dataType params.
	//Normally in java passing the param value differentiates and calls that related constructor
	//In spring the TypeCasting is automatically done so if i dont specify type and sets constructoe-arg first constructor called

	//constructor with parameter
	public Triangle(String type){
		this.type=type;
	}
	
	public Triangle(int height){
		this.height=height;
	}
	
	//constructor with two  parameter
		public Triangle(String type,int height){
			this.type=type;
			this.height=height;
		}
		
		
	public String getType() {
		return type;
	}

/*	public void setType(String type) {
		this.type = type;
	}*/

	public void draw(){
		System.out.println(getType()+" Triangle drawn with the height of "+getHeight());
	}
}
