package ma.ac.uiass.eia.springbootapp.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/employees")
public class EmployeeController {
  
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value="/")
	
	public List<Employee>getAllEmployees(){
		
		return service.getEmployees();
	}
	@GetMapping(value="/{id}")
	public Employee getEmployee(@PathVariable long id) {
		
		return this.service.getEmployeeById(id);
	}
	
   @PostMapping(value="/")
   public void addEmployee(@RequestBody Employee e) {
	   
	   this.service.addEmployee(e);
   }
   
   @PutMapping(value="/{id}")
   public void updateEmployee(@PathVariable long id,@RequestBody Employee e) {
	   
	   this.service.updateEmployee(e, id);
   }
   
   @DeleteMapping(value="/{id}")
   public void deleteEmployee(@PathVariable long id) {
		
		 this.service.deleteEmployee(id);
	}
}
