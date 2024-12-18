package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Rol;

import com.example.demo.service.IRolService;


@Controller
@RequestMapping("/rol")
public class RolController {
	
	@Autowired
	@Qualifier("rolservice")
	private IRolService rolService;
	
	@GetMapping("/list")
	public ModelAndView listAllRol() {
		ModelAndView mav = new ModelAndView("listrol");
		mav.addObject("roles", rolService.listAllRol());
		mav.addObject("rol", new Rol());
		return mav;
	}
	
	@PostMapping("/addroles")
	public String postMethodName(@ModelAttribute(name = "roles") Rol rol) {
		rolService.addRol(rol);
		return "redirect:/rol/list";
	}
	
}
