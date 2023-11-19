package com.mms.springCRUD001.mapper;

import com.mms.springCRUD001.Entity.User;
import com.mms.springCRUD001.dto.UserDTO;

public class UserMapper {
	
	public static UserDTO mapUserToUserDTO(User user) {
		
		UserDTO userDTO = new UserDTO();
		
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setAge(user.getAge());

		return userDTO;
	}

	public static User mapUserDTOtoUser(UserDTO userDTO) {

		User user = new User();

		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setAge(userDTO.getAge());

		return user;
	}

}
