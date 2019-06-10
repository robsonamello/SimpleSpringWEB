package br.com.simplespringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
   
	@RequestMapping(method = RequestMethod.GET)
   
	public String displayWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome to Simple Spring WEB");
		return "welcome";
	}
	
}