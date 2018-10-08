package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import agenda.daos.ContatoDAO;

@Controller
public class ContatoController {
	@RequestMapping("/contatos/form")
    public String form() {
		System.out.println("Chamou o form de contatos");
    	return "contatos/form";
    }
  @RequestMapping("/contatos")
public String adicionar(String nome) {
	  ContatoDAO dao = new ContatoDAO();
	  return "contatos/ok";
  }

}

