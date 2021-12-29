package group3.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import group3.tp5.model.Address;

@Controller
public class MeteoController {
	
	@RequestMapping(method=RequestMethod.POST,value="formulaire/meteo")
    public String getMeteo(@ModelAttribute Address address, Model model) {
        model.addAttribute("address",address);
        return "meteo";
    }
}
