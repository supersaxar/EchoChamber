package echochamber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * local - when running on localhost
 * testing - for testing environment
 * production - 'nuff said
 * test - in unit tests
 */

@SpringBootApplication
public class EchochamberApplication {
	public static void main(String[] args) {
		SpringApplication.run(EchochamberApplication.class, args);
	}
}
