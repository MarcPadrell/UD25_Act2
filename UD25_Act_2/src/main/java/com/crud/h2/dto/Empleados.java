package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleados") // en caso que la tabla sea diferente
public class Empleados {

	// Atributos de entidad cliente
	@Id
	@Column(name = "dni") // no hace falta si se llama igual
	private String dni;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellidos") // no hace falta si se llama igual
	private String apellidos;

	@ManyToOne
	@JoinColumn(name = "dep_cod")
	private Departamentos departamento;

	public Empleados() {

	}

	public Empleados(String dni, String nombre, String apellidos, Departamentos departamento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento + "]";
	}

}
