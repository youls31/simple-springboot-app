
package ma.ac.uiass.eia.springbootapp;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class BusinessServiceImp implements BusinessService {

	public BusinessServiceImp() {
		
	}

	@Override
	public void afficherDate() {
		System.out.println("nous somme le : "+LocalDate.now());

	}

}
