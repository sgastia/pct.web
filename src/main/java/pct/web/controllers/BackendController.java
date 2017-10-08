package pct.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/backend")
public class BackendController {

	
	/*Este anda ok
	@RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "backend";
    }
	*/
	
	//https://spring.io/guides/gs/handling-form-submission/
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String backend(Model model,@RequestParam(value="name", required=false, defaultValue="<no name>") String name) {
		model.addAttribute("name", name);
        return "backend";////tiene que coincidir con el nombre de la vista: pct.web\src\main\resources\templates\backend.html
	}
	
	@RequestMapping(value="/conciertos",method = RequestMethod.GET)
	public String conciertos(){
		return "backend_conciertos";//tiene que coincidir con el nombre de la vista: pct.web\src\main\resources\templates\backend_conciertos.html
		
	}
}
