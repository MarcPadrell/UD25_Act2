package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Departamentos;

public interface IDepartamentosService {

	// Metodos del CRUD
	public List<Departamentos> listarDepartamentos(); // Listar All

	public Departamentos guardarDepartamento(Departamentos departamentos); // Guarda un Departamentos CREATE

	public Departamentos departamentoXID(Long id); // Leer datos de un Departamentos READ

	public Departamentos actualizarDepartamentos(Departamentos departamentos); // Actualiza datos del Departamentos UPDATE

	public void eliminarDepartamento(Long id);// Elimina el Departamento DELETE

}
