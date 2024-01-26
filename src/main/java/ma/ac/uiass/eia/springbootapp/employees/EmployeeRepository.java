package ma.ac.uiass.eia.springbootapp.employees;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends 
JpaRepository<Employee,Long> {

	//ArrayList<Employee> findByNomAndPrenom(String nom, String prenom);
	
	
}
