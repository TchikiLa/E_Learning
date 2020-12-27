package com.Elearning.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Elearning.mvc.service.I_Cours_Service;
import com.Elearning.mvc.service.I_Examain_Service;
import com.Elearning.mvc.service.I_Question_Service;

@Controller
@RequestMapping(value = "/ens_question")
public class questionController {
	
	@Autowired
	private I_Cours_Service courService;
	
	@Autowired
	private I_Question_Service questionService;
	
	@Autowired
	private I_Examain_Service examainService;
	
	@RequestMapping(value = "/")
	public String index() {
		return "questions/ens_question";
	}
}
