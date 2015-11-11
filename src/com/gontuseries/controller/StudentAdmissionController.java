package com.gontuseries.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gontuseries.model.Student;
import com.gontuseries.util.StudentNameEditor;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(sdf, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
		
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage", "Gontu College of Engineering, India");
	}
	
	@RequestMapping(value="/admissionForm", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		
		ModelAndView model = new ModelAndView("AdmissionForm");
		
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		
		ModelAndView model = null;
		
		if(result.hasErrors()){
			model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		model = new ModelAndView("AdmissionSuccess");
		
		return model;
	}

}
