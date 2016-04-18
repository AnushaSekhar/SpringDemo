package org.Spring.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args){
		//Triangle triangle=new Triangle(); usual java
		
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));//blue print for the objects/classes
		//Triangle triangle =(Triangle)factory.getBean("triangle");//object created by spring
		
		//ApplicationContext behaves just like beanFactory with some extra features like event notification etc..
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");//specify spring file name thats enough no need to use resource Check:Path has to be in the same folder
		
		Triangle triangle =(Triangle)context.getBean("triangle");//object created by spring
		triangle.draw();
		Triangle triangle1 =(Triangle)context.getBean("triangle-alias");//object created by spring calling by alias tag name
		triangle1.draw();
		Triangle triangle2 =(Triangle)context.getBean("triangle-aliasName");//object created by spring calling by alias name
		triangle2.draw();
		
		//Object injection
		TriangleWithPoints triangleWithPoints =(TriangleWithPoints)context.getBean("triangleWP");//object created by spring
		triangleWithPoints.draw();
		
		//Collections
		//List 
		ApplicationContext collcontext1 = new ClassPathXmlApplicationContext("SpringCollection.xml");
		CollectionsExample collnExamp =(CollectionsExample)collcontext1.getBean("collectionEx");//object created by spring
		collnExamp.draw();
		
		//Autowiring :to skip some of the configrations automatically calling the bean (given bean name and member variable name same)
		//autowire by name,by type,by constructor default autowire is OFF
	}
}
