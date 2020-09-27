package br.eti.jfrancisco.springapp.delivery.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.eti.jfrancisco.springapp.delivery.HomePageController;

@Controller
public class HomePageControllerImpl implements HomePageController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
}
