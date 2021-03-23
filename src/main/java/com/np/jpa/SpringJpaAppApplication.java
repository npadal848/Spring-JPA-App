package com.np.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.np.jpa.entity.Customer;
import com.np.jpa.repo.CustomerRepository;

@SpringBootApplication
public class SpringJpaAppApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringJpaAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repo) {
		return (args) -> {
			log.info("START");
			
			repo.save(new Customer(1L, "Nagesh", "8457803030"));
			repo.save(new Customer(2L, "Pooja", "8144321707"));
			repo.save(new Customer(3L, "Tungu", "7899012348"));

			log.info(repo.findById(1L).toString());

			repo.findAll().forEach(customer -> log.info(customer.toString()));
			
			log.info("END");
		};
	}
}
