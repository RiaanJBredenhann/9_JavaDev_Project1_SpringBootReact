package net.javaguides.springboot;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Ramesh", "Fadatare", "Ramesh@gmail.com"));
		this.userRepository.save(new User("Jane", "Doe", "janedoe@gmail.com"));
		this.userRepository.save(new User("Mike", "Smith", "mikesmith@gmail.com"));
		this.userRepository.save(new User("Amy", "Harrison", "amyharrison@gmail.com"));
		this.userRepository.save(new User("James", "Randall", "jamesrandall@gmail.com"));
	}
}
