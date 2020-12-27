package com.Elearning.mvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping(value = "/403")
public class ErreurController {
	
	private static final String REFERER = "referer";
	
	@RequestMapping(value = "/")
	public String erreurpage(Model model,HttpServletRequest request) {
		String dernier_url = request.getHeader(REFERER);
		model.addAttribute("dernier_url", dernier_url);
		return "erreur/403";
	}
}
