package in.sp.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.beans.Student;

@SpringBootApplication
public class SpringBootProject5Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		stdBean().displayStdDetails();
	}

	public Student stdBean() {
		return new Student("Hardik",25,98.7f);
	}
}
