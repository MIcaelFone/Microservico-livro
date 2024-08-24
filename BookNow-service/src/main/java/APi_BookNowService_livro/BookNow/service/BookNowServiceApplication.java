package APi_BookNowService_livro.BookNow.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BookNowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookNowServiceApplication.class, args);
	}

}
