package in.sp.main;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.UserDao;
import in.sp.main.entity.User;

@SpringBootApplication
public class SpringBootProject7JdbcCrudApplication implements CommandLineRunner {

	@Autowired
	private UserDao userDao;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootProject7JdbcCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// TODO Auto-generated method stub

//		--------------Insertion------------------------------------

//		User user1 = new User("HArdik", "Hardikgmail.com", "male", "surat");
//		User user2 = new User("Ardik", "ardikgmail.com", "male", "surat");
//		User user3 = new User("diksa", "dikgmail.com", "female", "surat");
//
//
//		boolean status = userDao.insertUser(user3);
//
//		if (status) {
//			System.out.println("User Inserted Successfully");
//		} else {
//			System.out.println("User not inserted ");
//		}

//		------------------------------------------------------------

		
		
//		
//		--------------Updation------------------------

//		User user1 = new User("Ash", "Hardikgmail.com", "female", "kutch");
//		boolean status = userDao.updateUser(user1);
//		if (status) {
//			System.out.print("Updation successfully");
//		} else {
//			System.out.println("Error");
//		}

		
		
		
		// ------------------------Deletion-------------------

//		boolean status = userDao.deleteUser("Hardikgmail.com");
//		if (status) {
//			System.out.print("deletion successfully");
//		} else {
//			System.out.println("Error");
//		}
		
		
		
		//-----------------Selection for one user------------
//		User user=userDao.getUserByEmail("Hardikgmail.com");
//		System.out.println(user.getName());
//		System.out.println(user.getEmail());
//		System.out.println(user.getGender());
//		System.out.println(user.getCity());
		
		
		
		
//		 Select ALL User
		List<User> list=userDao.getAllUsers();
		for(User user:list) {
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getGender());
			System.out.println(user.getCity());
			System.out.println("-----------------------------------------");
		}
	}

}
