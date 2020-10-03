package br.eti.jfrancisco.infrastructure.delivery.impl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.eti.jfrancisco.infrastructure.delivery.HomePageController;

@Controller
public class HomePageControllerImpl implements HomePageController {

	@GetMapping("/")
	@Override
	public String index(Model model) {
		model.addAttribute("h1", "HomePage");
		return "home";
	}
}
