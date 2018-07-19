package com.haorenlin.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_APP {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptProvider8001_APP.class, args);
	}

}
