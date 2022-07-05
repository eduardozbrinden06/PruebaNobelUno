package com.example.pruebanobeluno.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebanobeluno.entity.PruebaUno;
import com.example.pruebanobeluno.interfaces.PruebaUnoRepository;

@RestController
@RequestMapping(path="/user")
public class PruebaUnoController {

	@Autowired
	private PruebaUnoRepository repo;
	
	
	//INGRESO DE DATOS A LA BD
	@PostMapping("/post")
	public List<PruebaUno> add(@RequestBody List<PruebaUno> val) {

		val.stream().forEach(valor -> {
			repo.save(valor);
		});
		return repo.findAll();
	}
	
	
	//MOSTRAR TODOS LOS REGISTROS
	@GetMapping("/getUser")
	public List<PruebaUno> views(){
		return repo.findAll();
	}
	
	
	// MOSTRAR POR ID
	@GetMapping("/getUser/{val}") 
	public Optional<PruebaUno> views(@PathVariable Integer val){
		return repo.findById(val);
	}

	
	//MODIFICAR POR UNA ID
	@PutMapping("/update")
	public PruebaUno views(@RequestBody PruebaUno val){
		return repo.save(val);
	}
	
	
	//ELIMINAR REGISTRO POR UNA ID
	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val){
	   repo.deleteById(val);
	   return "Id : " +val+ " delete";
	}
}
