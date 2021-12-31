package group3.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import group3.tp5.model.Address;

@Controller
public class FormController {
	
	 @GetMapping("/formulaire")
	  public String getForm(Model model) {
	    model.addAttribute("address", new Address());
	    return "formulaire";
	  }
	 
}