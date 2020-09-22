package com.scglab.sdtalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SdtalkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdtalkApplication.class, args);
	}

}
