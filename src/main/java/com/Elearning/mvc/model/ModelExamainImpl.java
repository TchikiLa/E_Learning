package com.Elearning.mvc.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.Elearning.mvc.entites.cours;
import com.Elearning.mvc.entites.examain;

@Component
public class ModelExamainImpl implements ModelExamain{

	private examain examain;
	
	@Override
	public void creeExamain() {
		
		examain = new examain();
		examain.setDate_examain(new Date());
	}
	@Override
	public examain getExamain() {
		return examain;
	}

	public void setExamain(examain examain) {
		this.examain = examain;
	}
	@Override
	public void modifierExamain(cours cour) {
		if(cour == null) {
			return;
		}
		if(examain != null) {
			examain.setIdCours(cour);
		}
		
	}


}
