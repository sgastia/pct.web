package pct.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/backend")
public class BackendController {
	
	//https://spring.io/guides/gs/handling-form-submission/
	
	@RequestMapping(value = {"/",""}, method = RequestMethod.GET)
	public String backendIndex(Model model,@RequestParam(value="name", required=false, defaultValue="<no name>") String name) {
		model.addAttribute("name", name);
        return "backend";//pct.web\src\main\resources\templates\backend.html
	}
	
	@RequestMapping(value="/conciertos",method = RequestMethod.GET)
	public String backendConciertos(){
		return "backend_conciertos";//pct.web\src\main\resources\templates\backend_conciertos.html
		
	}
	
	@RequestMapping(value="/videos",method = RequestMethod.GET)
	public String backendVideos(){
		return "backend_videos";//pct.web\src\main\resources\templates\backend_conciertos.html
		
	}
}
