package maps.monolith.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import maps.monolith.api.rf.domain.OperacaoRF;
import maps.monolith.api.rf.domain.OperacaoRFRepository;

@SpringBootApplication
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(OperacaoRFRepository repository) {
		return (args) -> {
			OperacaoRF operacaoRF = repository.findOne(100010L);
			System.out.println(operacaoRF);
			// save a couple of customers
			// repository.save(new Customer("Jack", "Bauer"));
			// repository.save(new Customer("Chloe", "O'Brian"));
			// repository.save(new Customer("Kim", "Bauer"));
			// repository.save(new Customer("David", "Palmer"));
			// repository.save(new Customer("Michelle", "Dessler"));
			//
			// // fetch all customers
			// log.info("Customers found with findAll():");
			// log.info("-------------------------------");
			// for (Customer customer : repository.findAll()) {
			// log.info(customer.toString());
			// }
			// log.info("");
			//
			// // fetch an individual customer by ID
			// Customer customer = repository.findOne(1L);
			// log.info("Customer found with findOne(1L):");
			// log.info("--------------------------------");
			// log.info(customer.toString());
			// log.info("");
			//
			// // fetch customers by last name
			// log.info("Customer found with findByLastName('Bauer'):");
			// log.info("--------------------------------------------");
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// log.info(bauer.toString());
			// }
			// log.info("");
		};
	}
}
