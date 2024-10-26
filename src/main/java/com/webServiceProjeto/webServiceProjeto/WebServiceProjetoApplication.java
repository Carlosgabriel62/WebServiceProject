package com.webServiceProjeto.webServiceProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceProjetoApplication.class, args);
		UsuarioRepository usRep=new UsuarioRepository();
		Usuario user=new Usuario("Carlos","bertunesgabriel6", "bertunes");
		UsuarioManager usman=new UsuarioManager(UsuarioRepository);
		usman.adicionarUsuario(user);
		System.out.println("adicionado");
	}

}
