package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class IndexController {
	
	@GetMapping("/")
	public String Inicio(Model model) {
		model.addAttribute("titulo1", "inicio");
		return "inicio";	
	}
	
	@GetMapping("/about")
	public String About(Model model) {
		model.addAttribute("titulo2", "About");
		return "about";	
	}
	
	@GetMapping("/portafolio")
	public String Portafolio(Model model) {
		model.addAttribute("titulo3", "Portafolio");
		return "portafolio";	
	}
	
	@GetMapping("/contacto")
	public String ChatBot(Model model) {
		model.addAttribute("titulo4", "contacto");
		return "contacto";	
	}	

}
