package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestapiApplication {
    //Singleton 1 class มี 1 instance
	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(RestapiApplication.class, args);
//		GenerateIdService service1 = ctx.getBean(GenerateIdService.class);
//		System.out.println("====>" + service1.counter);
//		service1.counter ++;
//		GenerateIdService service1 = ctx.getBean(GenerateIdService.class);
//		System.out.println("====>" + service1.counter);
//		service1.counter ++;
//		GenerateIdService service2 = ctx.getBean(GenerateIdService.class);
//		System.out.println("====>" + service2.counter);
		//จะได้ 1 instance เสมอ Web application เป็น Singleton
		//เช่น ถ้ามี 100000 request ไม่ต้องสร้าง 100000 instance ไม่่งั้นจะ 1 instance 1 mb 100000 instance = 100000 mb
		//ทุก ๆ request จะแชร์ data กัน
	}

}
