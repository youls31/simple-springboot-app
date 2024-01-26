package ma.ac.uiass.eia.springbootapp.formations;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormationController {
	
@Autowired
private FormationService service;


	@RequestMapping("/formations")
	public List<Formation> getAllFormations(){
		return this.service.getAllFormations();
	}
  
	@RequestMapping("/formations/{param}")
	public Formation getFormation(@PathVariable("param") long id) {
		
		return this.service.getFormationById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/formations")
	public void addFormation(@RequestBody Formation f) {
		this.service.addFormation(f);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/formations/{id}")
	
	public void updateFormation(@RequestBody Formation f,@PathVariable long id) {
		
		this.service.updateFormation(f,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="formations/{id}")
	public void deleteFormation(@PathVariable long id) {
		this.service.deleteFormation(id);
	}
}
