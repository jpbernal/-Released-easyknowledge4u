package es.codeurjc.easyknowledge4u;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	
	
	@GetMapping("/")
	public String Index () {
		
		
		return "Index.html";
		
	}

	
	
}