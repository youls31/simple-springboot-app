package ma.ac.uiass.eia.springbootapp.employees;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="/clients")
public class ClientController {
	@Autowired
	private EmployeeRepository employeRepository;
	
	@RequestMapping(value="/addClient")
	public String addClient(Model model) {
		
		model.addAttribute("name", "adil");
		model.addAttribute("job", "enseignant");
		return "index.html";
	}
	
	@PostMapping(value="/addClient")
	public String addClient(@RequestParam MultiValueMap body ,Model model) {
		   String nom = (String) body .getFirst("lastName");	
		String prenom = (String) body .getFirst("firstName");
	
//	System.out.println(nom +' '+prenom);
	//employeRepository.save(e1);
	model.addAttribute("nom", nom);
	model.addAttribute("prenom", prenom);
	
	return "confirm";
	}
	
	@RequestMapping(value="/show")
	public ModelAndView showAll() {
		ArrayList <Employee> al =(ArrayList<Employee>)
				employeRepository.findAll();
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("tab", al);
	return mv;
	}
	
	@RequestMapping(value="/showAllByPage/{i}/{j}")
	public ModelAndView showAllByPage(@PathVariable int i,
	@PathVariable int j) {
	Page<Employee> employees = employeRepository.findAll(
	PageRequest.of(i, j));
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("tab", employees.getContent());
	return mv;
	}
	@RequestMapping(value="/showAllSorted")
	public ModelAndView showAllSorted() {
	List<Employee> employees = employeRepository.findAll(
	Sort.by("lastName").descending());
	ModelAndView mv = new ModelAndView();
	mv.setViewName("result");
	mv.addObject("tab", employees);
	return mv;
	}
	
	@RequestMapping(value="/showSomeEmployee")
	public ModelAndView showSome(@RequestParam(value =
		"nom") String nom, @RequestParam(value = "prenom"
	   ) String prenom) {
	  // ArrayList <Employee> al =(ArrayList<Employee>)
	 // employeRepository.findByNomAndPrenom(nom, prenom);
	ModelAndView mv = new ModelAndView();
	  mv.setViewName("result");
	  //mv.addObject("tab", al);
	  return mv;
	}	
	
	@RequestMapping(value="/hello2")
	public String sayHello(@RequestParam(value="nom",required =false,
	defaultValue="Adil") String nom) {
		 return "Hello"+ ' ' +nom;
	}
	
	@RequestMapping(value="/hello/{nom}")
	public String sayHello2(@PathVariable String nom) {
		return "Hello"+ ' ' +nom;
	}
}
