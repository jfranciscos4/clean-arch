package br.eti.jfrancisco.infrastructure.delivery;

import org.springframework.ui.Model;

public interface HomePageController {
	
	/**
	 * Página Inicial
	 * 
	 * @param model
	 * @return
	 */
	public String index(Model model);

}
