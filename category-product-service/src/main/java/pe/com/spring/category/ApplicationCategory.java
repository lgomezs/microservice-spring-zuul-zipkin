package pe.com.spring.category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationCategory {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationCategory.class, args);
	}
}
