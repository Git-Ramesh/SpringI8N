package com.rs.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rs.command.Student;

@Controller
public class StudentController {
	public StudentController() {
		System.out.println("StudentController: 0-param constr");
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String registerPage(@ModelAttribute("student")Student student) {
		return "register";
	}
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public String loginSuccess(Map<String,Object> map,@Valid@ModelAttribute("student")Student student,BindingResult results ) {
		if(results.hasErrors())
			return "register";
		System.out.println(student);
		map.put("student", student);
		return "register_success";
	}
	@ModelAttribute("technologies")
	public List<String> technologies(){
		//System.out.println("technologies()");
		List<String> techList=null;
		
		techList=new ArrayList<>();
		techList.add("Hibernate");
		techList.add("Spring");
		techList.add("JSP");
		techList.add("Servlet");
		techList.add("Struts");
		
		return techList;
	}
	@ModelAttribute("genders")
	public List<String> genders(){
		List<String> genderList=null;
		
		genderList=new ArrayList<>();
		genderList.add("Male");
		genderList.add("Female");
		
		return genderList;
	}
	@ModelAttribute("cities")
	public List<String> cities(){
		List<String> citiesList=null;
		
		citiesList=new ArrayList<>();
		citiesList.add("Pune");
		citiesList.add("Hyderabad");
		citiesList.add("Chennai");
		citiesList.add("Delhi");
		citiesList.add("Other");
		
		return citiesList;
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class,"dob",new CustomDateEditor(df, true));
	}
}