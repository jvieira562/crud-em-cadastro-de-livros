package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.LivroModels;

public interface LivroRepository extends JpaRepository<LivroModels, Long> {

}
