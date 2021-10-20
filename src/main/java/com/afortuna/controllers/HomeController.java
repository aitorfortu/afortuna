package com.afortuna.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// HOME
	@GetMapping("/")
	public String home(final ModelMap modelo) {
		modelo.put("view", "home/index");
		return "_t/frame";
	}

	// BLOG
	@GetMapping("/blog")
	public String blog(final ModelMap modelo) {
		modelo.put("view", "home/blog");
		return "redirect:https://afortunag.blogspot.com/";
	}

	// TECNOLOGIAS
	@GetMapping("/tecno")
	public String tecno(final ModelMap modelo) {
		modelo.put("view", "home/tecno");
		return "_t/frame";
	}

	// PROYECTOS
	@GetMapping("/proyectos")
	public String proyectos(final ModelMap modelo) {
		modelo.put("view", "home/proyectos");
		return "_t/frame";
	}
}
