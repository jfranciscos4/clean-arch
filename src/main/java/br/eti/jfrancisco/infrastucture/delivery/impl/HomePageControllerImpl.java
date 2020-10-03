package br.eti.jfrancisco.infrastucture.delivery.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.eti.jfrancisco.infrastucture.delivery.HomePageController;

@Controller
public class HomePageControllerImpl implements HomePageController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
}
