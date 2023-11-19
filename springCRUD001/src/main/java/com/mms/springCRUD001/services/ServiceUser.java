package com.mms.springCRUD001.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.springCRUD001.dto.UserDTO;
import com.mms.springCRUD001.mapper.UserMapper;
import com.mms.springCRUD001.repository.UserRepository;

@Service
public class ServiceUser {

	@Autowired
	UserRepository userRepository;

	public List<UserDTO> getListaUsuariosDummy(){
		return userRepository
				.findAll()
				.stream()
				.map(user -> UserMapper.mapUserToUserDTO(user))
				.toList();
	}

//	public List<UserDTO> getListaUsuarios(){
//		return getListaDummy();
//	}
//
//	public List<UserDTO> getListaDummy() {
//
//		List<UserDTO> listaDummy = new ArrayList<>();
//		
//		listaDummy.add(
//			UserDTO.builder()
//			.id(1)
//			.name("Usuario 1")
//			.age(1)
//			.build()
//		);
//
//		listaDummy.add(
//			UserDTO.builder()
//			.id(2)
//			.name("Usuario 2")
//			.age(2)
//			.build()
//		);
//
//		listaDummy.add(
//			UserDTO.builder()
//			.id(3)
//			.name("Usuario 3")
//			.age(3)
//			.build()
//		);
//		
//		return listaDummy;
//	}
	
}