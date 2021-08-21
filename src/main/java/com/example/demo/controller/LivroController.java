package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.LivroModels;
import com.example.demo.repository.LivroRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class LivroController {

	@Autowired
	private LivroRepository repository;

	@GetMapping("/livros")
	public List<LivroModels> getAllLivros() {
		return repository.findAll();
	}

	@PostMapping("/livro")
	public LivroModels saveLivro(@RequestBody LivroModels livro) {
		return repository.save(livro);
	}

	@GetMapping("/livro/{id}")
	public LivroModels getLivroById(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@DeleteMapping("/livro/{id}")
	public void deleteLivro(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
