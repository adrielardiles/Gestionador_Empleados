package com.gestion.empleados.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.empleados.modelo.empleado;
import com.gestion.empleados.repositorio.empleadoRepositorio;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoControlador {

	@Autowired
	private empleadoRepositorio repositorio;

	@GetMapping("/empleados") //empleados --> endpoint
	public List<empleado> listarTodosLosEmpleados() {
		return repositorio.findAll();
	}

}
