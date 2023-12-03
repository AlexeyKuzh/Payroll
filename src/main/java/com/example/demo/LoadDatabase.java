package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	/*
	 * getLogger(java.lang.String): этот метод используется для поиска или создания средства ведения журнала с
	 * именем, переданным в качестве параметра .(взял с интернета)
	 */
	private static final Logger log = 
				LoggerFactory.getLogger(LoadDatabase.class);
	
	@Bean 
	CommandLineRunner initDatabase(EmployeeRepository repository) {
		return args->{
			
			log.info("Preloading " + repository.save(new Employee("Bilbo Baggins","burglar")));
			
			log.info("Preloading "+ repository.save(new Employee("Frodo Baffins","thief")));
		};
			
	}
	
}

