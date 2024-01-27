package ma.ac.uiass.eia.springbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class RestApiApp implements CommandLineRunner{ 
	
	@Autowired 
	private  BusinessService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiApp.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		service.afficherDate();;
		
	}
  
}
