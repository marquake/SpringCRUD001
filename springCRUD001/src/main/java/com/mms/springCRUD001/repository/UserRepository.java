package com.mms.springCRUD001.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mms.springCRUD001.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	//List<User> findByUser(User user);

	//@Query("SELECT c FROM Cliente c WHERE c.nombre= :alias AND c.cliente_id= :id")
	//Cliente getClientePorAlias(@Param("alias") String alias,@Param("id")Integer id);

}
