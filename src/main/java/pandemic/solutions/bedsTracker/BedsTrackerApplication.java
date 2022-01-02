package pandemic.solutions.bedsTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "pandemic.solutions.bedsTracker.repository")
@ComponentScan(basePackages = { "pandemic.solutions.bedsTracker" })
public class BedsTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BedsTrackerApplication.class, args);
	}

}
