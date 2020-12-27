package com.Elearning.mvc.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Elearning.mvc.entites.examain;
import com.Elearning.mvc.model.ModelExamain;
import com.Elearning.mvc.entites.cours;
import com.Elearning.mvc.service.I_Cours_Service;
import com.Elearning.mvc.service.I_Examain_Service;

@Controller
@RequestMapping(value = "/ens_examain")
public class examainController {
	
	@Autowired
	private I_Cours_Service courService;
	
	@Autowired
	private I_Examain_Service examainService;
	
	@Autowired
	private ModelExamain modelexamain;
	
	@RequestMapping(value = "/")
	public String examain(Model model) {
		////////////////////////////
		List<examain> examain = examainService.selectALL();

		if(examain == null) {
			examain = new ArrayList<examain>();
		}

		model.addAttribute("examain", examain);
		/////////////////////////////
		return "examain/ens_examain";
	}
	
	/*
	@RequestMapping(value = "/nouveau" )
	public String nouveauExamain(Model model) {
		List<cours> courr= courService.selectALL();
		if(courr.isEmpty()) {
			courr = new ArrayList<cours>();
		}
		modelexamain.creeExamain();
		model.addAttribute("courr", courr);
		return "examain/ens_ajouter_examain";
	}
	
	
	@RequestMapping(value = "/creerexamain" )
	@ResponseBody
	public String creerexamain(final Long idCours, String date_examain, String Note_examain) {
		
		cours cour = courService.getById(idCours);
	
		return "ok";
	}*/
/*	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterexamain(Model model) {
		List<cours> courr= courService.selectALL();
		examain examain = new examain();
		
		model.addAttribute("examain", examain);
		model.addAttribute("courr", courr);
		return "examain/ens_ajouter_examain";
	}
	
	@RequestMapping(value = "/nouveau", method = RequestMethod.POST)
	public String enregistrerexamain(examain examain) {
	 
			examainService.save(examain);
		
			
		return "redirect:/ens_examain/";
	}
	*/
}
