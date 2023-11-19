package com.mms.springCRUD001.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.springCRUD001.Entity.User;
import com.mms.springCRUD001.dto.UserDTO;
import com.mms.springCRUD001.services.ServiceUser;

@RestController
public class ControllerUser {

	@Autowired
	ServiceUser serviceUser;
	
	@GetMapping("/Usuario")
	public List<UserDTO> getListaUsuarios() {
		return serviceUser.getListaUsuarios();
	}

	@GetMapping("/UsuarioMayores2")
	public List<UserDTO> getListaUsuariosAgeGreaterThan2() {
		return serviceUser.getListaUsuariosAgeGreaterThan2();
	}
	
	
	
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
