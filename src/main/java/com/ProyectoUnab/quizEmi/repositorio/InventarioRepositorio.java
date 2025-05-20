package com.ProyectoUnab.quizEmi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoUnab.quizEmi.entidades.Inventario;

public interface InventarioRepositorio extends JpaRepository<Inventario, String> {
	
	

}
