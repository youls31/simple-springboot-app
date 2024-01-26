package ma.ac.uiass.eia.springbootapp.products;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.ac.uiass.eia.springbootapp.employees.Employee;

@Controller
@RequestMapping(path="/products")
public class ProductWebController {
 
	  @GetMapping(value="/addProduct")
	  public String addNewProduit(Model model) {
		  return "newproduct";
	  }
	 @PostMapping(value="/addProduct")
	   public String addEmployee(@RequestParam MultiValueMap body ,Model model) {
		 String name = (String) body .getFirst("name");  
		 String price = (String) body .getFirst("price");	
		   System.out.println(name + " : " +price);
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		return "confirmprod";
		   
	   }
}
