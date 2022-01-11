package com.bolsadeideas.springboot.di.app.models.domain;

public class Producto {
	
	private String nombre;
	private Long precio;	
	
	public Producto(String nombre, Long precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getPrecio() {
		return precio;
	}
	
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	
}