package com.springexample.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext= SpringApplication.run(SpringExampleApplication.class, args);
BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);

		int result=binarySearch.binarySearch(new int[] {1,5,3,4},3);
		if(result==-1)
			System.out.println("Value isn't found");
		else
		System.out.println("The value is found at index: "+result);

	}

}
