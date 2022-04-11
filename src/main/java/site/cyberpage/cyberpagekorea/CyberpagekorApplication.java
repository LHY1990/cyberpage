package site.cyberpage.cyberpagekorea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CyberpagekorApplication {

	public static void main(String[] args) {
		System.out.println("어플리케이션 접근");
		SpringApplication.run(CyberpagekorApplication.class, args);
	}

}
