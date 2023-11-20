package com.mms.springCRUD001.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mms.springCRUD001.annotation.LogExecutionTime;
import com.mms.springCRUD001.dto.UserDTO;
import com.mms.springCRUD001.services.ServiceUser;

// base de datos
// http://localhost:8080/h2-console

@RestController
public class ControllerUser {

	@Autowired
	ServiceUser serviceUser;

	//http://localhost:8080/Usuario
	@LogExecutionTime
	@GetMapping("/Usuario")
	public List<UserDTO> getListaUsuarios() {
		return serviceUser.getListaUsuarios();
	}

	//http://localhost:8080/UsuarioMayores2
	@GetMapping("/UsuarioMayores2")
	public List<UserDTO> getListaUsuariosAgeGreaterThan2() {
		return serviceUser.getListaUsuariosAgeGreaterThan2();
	}
	
	//http://localhost:8080/UsuarioByPage?page=2&size=3&sortBy=name
	@GetMapping("/UsuarioByPage")
	public List<UserDTO> getListaUsuariosAgeGreaterThan1(@RequestParam(defaultValue = "0") int page, 
														 @RequestParam(defaultValue = "5") int size, 
														 @RequestParam(defaultValue = "name") String sortBy) {

		Pageable pagina = PageRequest.of(page, size, Sort.by(sortBy));

		return serviceUser.getListaUsuariosByPage(pagina);
	}

	//http://localhost:8080/UsuarioByNameEdad?name=juan&edad=4
	//http://localhost:8080/UsuarioByNameEdad?name=delegado&edad=3
	//http://localhost:8080/UsuarioByNameEdad?name=padillo&edad=12
	@GetMapping("/UsuarioByNameEdad")
	public List<UserDTO> findByNameAndEdad(	@RequestParam String name, 
											@RequestParam int edad) {

		return serviceUser.findByNameAndEdad(name, edad);
	}

//	@GetMapping("/Usuario")
//	public List<UserDTO> getListaUsuarios1() {
//		
//		Pageable pagina = new  
//		
//		return serviceUser.getListaUsuarios();
//	}
	
	
//	public UserDTO mapUserEntityToUserDTO(User userEntity){
//		UserDTO userDTO = new UserDTO();
//		
//		userDTO.setId(userEntity.getId());
//		userDTO.setName(userEntity.getName());
//		userDTO.setAge(userEntity.getAge());
//		
//		return userDTO;
//	}
}
