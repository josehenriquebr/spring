package com.exemple.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
