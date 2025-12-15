package in.sp.main.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.beans.Student;

@Configuration
public class AppConfig {
	public CommandLineRunner clr() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				stdBean().displayStdDetails();
			}
		};

	}

	@Bean
	public Student stdBean() {
		return new Student("Hardik", 25, 98.7f);
	}
}
