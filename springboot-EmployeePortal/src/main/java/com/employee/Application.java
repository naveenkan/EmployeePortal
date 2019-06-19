package com.employee;
import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

/*import net.guides.springboot2.springboot2jpacrudexample.controller.RestClient;*/
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:4200")
@EnableSwagger2
public class Application {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	/*@Bean
	public RestClient getRestClient(){
		return new RestClient();
	}*/
	@Profile("dev")
	@Bean
	public String devProfile(){
		System.out.println("Dev Bean");
		return "Dev profile testing";
	}
	@Profile("test")
	@Bean
	public String testProfile(){
		System.out.println("test Bean");
		return "test profile testing";
	}
	
	public static void main(String[] args) {
		/*ApplicationContext ctx=*/SpringApplication.run(Application.class, args);
		/*RestClient rc=ctx.getBean(RestClient.class);
		rc.createUsers();*/
	}
	
}