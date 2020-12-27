package com.Elearning.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Elearning.mvc.entites.etudiant;
import com.Elearning.mvc.service.I_Etudiant_Service;

@Controller
@RequestMapping(value = "/ens_etudiant")
public class etudiantController {
	
	//pour injecter les etudiant_service dans etudiant_DAO
	@Autowired
	private I_Etudiant_Service etudiantService;
	
	@RequestMapping(value = "/")
	public String etudiant(Model model) {
		List<etudiant> etudiants = etudiantService.selectALL();
		if(etudiants == null) {
			etudiants = new ArrayList<etudiant>();
		}
		model.addAttribute("etudiants", etudiants);
		return "etudiant/ens_etudiant";
	}
}
