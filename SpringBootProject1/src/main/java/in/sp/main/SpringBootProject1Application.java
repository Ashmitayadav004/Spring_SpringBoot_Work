package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProject1Application {

	public static void main(String[] args) {
		System.out.println("Application started");
		SpringApplication.run(SpringBootProject1Application.class, args);
		System.out.println("Application opened");
	}

}
