package com.fer.fichconfig;

import java.io.Serializable;

public class Producto implements Serializable {
	
	private String nombre;
	private float precio;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
