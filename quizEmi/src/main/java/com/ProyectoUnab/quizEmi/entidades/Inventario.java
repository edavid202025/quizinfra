package com.ProyectoUnab.quizEmi.entidades;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;


@Entity
@Table(name= "inventario")
public class Inventario {
	
	@Id
	@Column(name="id")
	private String Id;
	
	private String nombredelequipo;
	
	private String categoria;
	
	private String marca;

	
	private Long precio;
	
	private String estado;
	
	private String observacion;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getNombredelequipo() {
		return nombredelequipo;
	}

	public void setNombredelequipo(String nombredelequipo) {
		this.nombredelequipo = nombredelequipo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}	
	
	
}


