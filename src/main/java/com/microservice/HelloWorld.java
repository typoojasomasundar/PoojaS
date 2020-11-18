package com.microservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorld {
@RequestMapping("/")
	
String hello()
{
	return "HEllo world microservices tutorial";
}
public static void main(String[] args) throws Exception
{
		SpringApplication.run(HelloWorld.class, args);

	}

}
