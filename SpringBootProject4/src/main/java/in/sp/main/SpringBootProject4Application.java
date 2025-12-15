package in.sp.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProject4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		myClass().printMessage("Hardik");

	}

	@Bean
	public MyClass myClass() {

		return new MyClass();// returns object

	}

}
