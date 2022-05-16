package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadosDAO;
import com.crud.h2.dto.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService {
	
	@Autowired
	IEmpleadosDAO iEmpleadosDAO;

	@Override
	public List<Empleados> listarEmpleados() {
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleados guardarEmpleado(Empleados empleados) {
		return iEmpleadosDAO.save(empleados);
	}

	@Override
	public Empleados empleadosXID(String dni) {
		return iEmpleadosDAO.findById(dni).get();
	}

	@Override
	public Empleados actualizarEmpleados(Empleados empleados) {
		return iEmpleadosDAO.save(empleados);
	}

	@Override
	public void eliminarEmpleados(String dni) {
		iEmpleadosDAO.deleteById(dni);

	}

	@Override
	public List<Empleados> listarEmpleadoNombre(String nombre) {
		return iEmpleadosDAO.findByNombre(nombre);
	}

}
