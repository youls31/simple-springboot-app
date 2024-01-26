package ma.ac.uiass.eia.springbootapp.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
	@Autowired
	 private EmployeeRepository repo;

	public List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<>();
		 repo.findAll().forEach(list::add);
		 return list;
	}

	public void addEmployee(Employee e) {
		this.repo.save(e);
		
	}

	public void updateEmployee(Employee e, long id) {
	 Optional<Employee> emp = this.repo.findById(id);
	 if(emp.isPresent()) {
		 Employee currentEmp = emp.get();
		 String lastName =  e.getLastName();
		 if(lastName!= null) {
			 currentEmp.setLastName(lastName);
		 }
		 String firstName = e.getFirstName();
		 if(firstName != null) {
			 currentEmp.setFirstName(firstName);
		 }
		 String mail = e.getMail();
		 if(mail != null) {
			 currentEmp.setMail(mail);
		 }
		 this.repo.save(currentEmp);
	 }
		
		
	}

	public Employee getEmployeeById(long id) {
	Optional<Employee> e = this.repo.findById(id);
	if(e.isPresent()) {
		return e.get();
		
	}
		return null;
		
	}

	public void deleteEmployee(long id) {
		this.repo.deleteById(id);
		
	}

   
}
