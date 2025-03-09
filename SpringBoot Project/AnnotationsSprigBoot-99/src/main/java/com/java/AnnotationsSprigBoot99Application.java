package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.java.Value.ValueAnnotationDemo;
import com.java.contoller.PizzController;
import com.java.lazy.LazyLoader;
import com.java.propertysource.PropertySourceDemo;
import com.java.scope.Protype;
import com.java.scope.Singleton;
import com.java.service.VegPizza;

@SpringBootApplication
public class AnnotationsSprigBoot99Application {

	public static void main(String[] args) {
  ApplicationContext context		=SpringApplication.run(AnnotationsSprigBoot99Application.class, args);
  
//  ValueAnnotationDemo annotationDemo=context.getBean(ValueAnnotationDemo.class);
//  System.out.println(annotationDemo.getDefaultName());
//  System.out.println(annotationDemo.getHost());
//  System.out.println(annotationDemo.getPassword());
//  System.out.println(annotationDemo.getEmail());
//  System.out.println(annotationDemo.getHomeDir());
//  System.out.println(annotationDemo.getJavaHome());
//   
  PropertySourceDemo propertySourceDemo=context.getBean(PropertySourceDemo.class);
  System.out.println(propertySourceDemo.getHost());
  System.out.println(propertySourceDemo.getEmail());
  System.out.println(propertySourceDemo.getPassword());
  
	}

}
