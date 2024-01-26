package ma.ac.uiass.eia.springbootapp.formations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FormationService {

	 @Autowired	(required=true)
	private FormationRepository formationRepository;
	
	  
	/*
	 * private List<Formation> formations = new ArrayList<>(Arrays.asList( new
	 * Formation("java", "java 8", "java 8 description", "5j"), new
	 * Formation("Spring", "Spring boot", "Spring boot description", "4j"), new
	 * Formation("Mongodb", "Mongodb", "Mongodb description", "3j"), new
	 * Formation("Angular", "Angular framework", "Angular framework description",
	 * "6j") ));
	 */

	public FormationService() {
		
	}
	public List<Formation> getAllFormations(){
		List<Formation>	result = new ArrayList<>();	
		 formationRepository.findAll()
		  .forEach(result::add);
		 return result;
	}
	
	public Formation getFormationById(long id) {
		//return this.formations.stream().filter(f->f.getId().equalsIgnoreCase(id)).findFirst().get();
	   return formationRepository.findById(id).get();
	}
	
	public void addFormation(Formation f) {
		this.formationRepository.save(f);
	}
	public void updateFormation(Formation f, long id) {

     Formation oldFormation = this.formationRepository.findById(id).get();
     this.formationRepository.save(oldFormation);
		
	}
	public void deleteFormation(long id) {
		this.formationRepository.deleteById(id);
		
	}
}
