package com.investimentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


	 @GetMapping("/")
	public String index(){
		return "index";
	}


}































/*	@GetMapping("/login")
	public String login(Model model) {
		List<Plans> plans = plansRepo.findAll();
		model.addAttribute("plans",plans);
		return "login";
	}*/
