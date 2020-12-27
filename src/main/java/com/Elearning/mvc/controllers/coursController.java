package com.Elearning.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Elearning.mvc.service.I_Cours_Service;
import com.Elearning.mvc.entites.cours;

@Controller
@RequestMapping(value = "/ens_cours")
public class coursController {

	@Autowired
	private I_Cours_Service courService;
	
	@RequestMapping(value = "/")
	public String cours(Model model) {
		////////////////////////////
		List<cours> cour = courService.selectALL();
		
		if(cour == null) {
			cour = new ArrayList<cours>();
		}
		
		model.addAttribute("cour", cour);
		/////////////////////////////
		return "cours/ens_cours";
	}
	//methode pour rediriger vers la page ens_ajouter_cours.jsp
	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterCours(Model model) {
		cours courr = new cours();
		//courr.setTitre_cours("qdsfqsdfqsdf");
		
		model.addAttribute("courr", courr);
		return "cours/ens_ajouter_cours";
	}
	
	@RequestMapping(value = "/nouveau", method = RequestMethod.POST)
	public String enregistrerCours(Model model,cours courr) {
		
		//verifier si id existe 
		if(courr.getId_cours() != 0L) {
			
			courService.update(courr);
		}else {
			courService.save(courr);
		}
			
			
		return "redirect:/ens_cours/";
	}
	//methode de modification de cour
	@RequestMapping(value = "/modifier/{id_cours}")
	public String mofifierCours(Model model,@PathVariable Long id_cours) {
		if(id_cours != null) {
			cours courr = courService.getById(id_cours);
			if(courr != null) {
				model.addAttribute("courr", courr);
			}
		}
		return "cours/ens_ajouter_cours";
	}
	
	//methode de suppression de cour
	@RequestMapping(value = "/supprimer/{id_cours}")
	public String supprimerCours(Model model,@PathVariable Long id_cours) {
		if(id_cours != null) {
			cours courr = courService.getById(id_cours);
			if(courr != null) {
				//il faut verifier les dependance avant de supprimer (A Ajouter)
				courService.remove(id_cours);
			}
		}
		return "redirect:/ens_cours/";
	}
}
