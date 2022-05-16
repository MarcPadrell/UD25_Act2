package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Empleados;

public interface IEmpleadosService {

	// Metodos del CRUD
	public List<Empleados> listarEmpleados(); // Listar All

	public Empleados guardarEmpleado(Empleados empleados); // Guarda un video CREATE

	public Empleados empleadosXID(String dni); // Leer datos de un video READ

	public Empleados actualizarEmpleados(Empleados empleados); // Actualiza datos del video UPDATE

	public void eliminarEmpleados(String dni);// Elimina el video DELETE

	List<Empleados> listarEmpleadoNombre(String nombre);

}
