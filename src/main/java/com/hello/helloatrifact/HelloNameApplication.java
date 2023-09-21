package com.hello.helloatrifact;

import com.hello.helloatrifact.Controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloNameApplication {

	public static void main(String[] args) {

//		========================================================
		SpringApplication.run(HelloNameApplication.class, args);

		HelloController helloController = new HelloController();
//		========================================================
		// I created the object of HelloController above
		// I don't have to create the object, Sprint boot will do it automatically


//		========================================================
//		ApplicationContext ctx = (ApplicationContext) SpringApplication.run(HelloNameApplication.class, args);
//
//		HelloController controller = (HelloController) ctx.getRealPath("helloController");
//		===========================================================
		System.out.println(helloController.sayHello());
		System.exit(1);

	}
}
