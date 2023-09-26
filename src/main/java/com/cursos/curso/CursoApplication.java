package com.cursos.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * Clase que ejecuta la aplicación y escanea los componentes
 */
@SpringBootApplication @ComponentScan({"com.cursos.controller, com.cursos.service"})
public class CursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

}
