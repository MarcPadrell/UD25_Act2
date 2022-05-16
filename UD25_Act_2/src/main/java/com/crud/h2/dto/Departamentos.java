package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "departamentos") // en caso que la tabla sea diferente
public class Departamentos {

	// Atributos de entidad cliente
	@Id
	@Column(name = "codigo") // busca ultimo valor e incrementa desde id final de db
	private Long codigo;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "presupuesto") // no hace falta si se llama igual
	private int presupuesto;

	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Empleados> empleado;
	
	public Departamentos() {
		
	}

	public Departamentos(Long codigo, String nombre, int presupuesto, List<Empleados> empleado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleado = empleado;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void setEmpleado(List<Empleados> empleado) {
		this.empleado = empleado;
	}
	
	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleados")
	public List<Empleados> getEmpleado() {
		return empleado;
	}

	@Override
	public String toString() {
		return "Departamentos [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleado="
				+ empleado + "]";
	}
	

}
