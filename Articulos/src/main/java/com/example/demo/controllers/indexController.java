package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Articulos;

@RequestMapping ("/app")
@Controller

public class indexController {
	
	

	@GetMapping ({"/index", "/", "/home", ""})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Bienvenidos a nuesntra pagina Web");
		
		return "index";
	}
	
	@RequestMapping ("/listar")
	public String listar (Model model) {
		model.addAttribute("titulo", "Listado de articulos");
		
		return "listar";
	}
	
	@ModelAttribute("articulos")
	public List<Articulos> poblarArticulos(){
		List <Articulos> articulos = Arrays.asList(new Articulos("Leche","Producto Lacteo","Lala","$23","12","LALA"),
				new Articulos("Mayonesa","Este producto es un adereso","McCORMICK","$18","7","COMA"),
				new Articulos("Galleta","Galleta sabor chocolate","Oreo","$12","5","San Rafael"),
				new Articulos("Sabrita","Sabrita picosa sabor chile-limon","Cheetos FH","$7","32","SABRITAS"),
				new Articulos("Cereal","Producto bajo en grasa saborisado con miel","Corn flakes","$21","13","COMA"),
				new Articulos("Chile","Producto alto en picor","La Costeña","$13","22","COMA"));
		
		return articulos;
	}


	
}
