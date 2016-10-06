package br.com.rgp.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.rgp.brewer.model.Cerveja;

@Controller
public class CervejasController {

	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja) {
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes redirAttrib) {
		
		if (result.hasErrors()) {
			return novo(cerveja);
		}
		
		System.out.println(cerveja.getSku());
		System.out.println(cerveja.getNome());
		System.out.println(cerveja.getDescricao());
		
		// Salvar no banco de dados...
		
		redirAttrib.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		return "redirect:/cervejas/novo"; // redirect
	}
	
	@RequestMapping("/cervejas/cadastro")
	public String cadastro() {
		return "cerveja/cadastro-produto";
	}
	
	@RequestMapping("/gentelella/form")
	public String form() {
		return "cerveja/gentelella-form";
	}
	
}
