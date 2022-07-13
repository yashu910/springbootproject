package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public  SpringBootMySqlApplication {

	public static void main(String[] args) {
		System.out.print("inside main class");	
		SpringApplication.run(SpringBootMySqlApplication.class, args);
	}
}
