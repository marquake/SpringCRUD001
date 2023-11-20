package com.mms.springCRUD001.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mms.springCRUD001.Entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	//List<User> findByUser(User user);

	//@Query("SELECT c FROM Cliente c WHERE c.nombre= :alias AND c.cliente_id= :id")
	//Cliente getClientePorAlias(@Param("alias") String alias,@Param("id")Integer id);

	//@Query("SELECT u FROM Users u WHERE u.age > 2")
	//List<User> findUserAgeGreaterThan2();

	@Query(	value="SELECT * FROM Users u WHERE u.edad > 2", 
			nativeQuery = true)
	List<User> findUserAgeGreaterThan2();

	@Query(	value="SELECT * FROM Users u", 
			nativeQuery = true)
	List<User> findUserBypPage(Pageable pagina);

	List<User> findByNameAndAge(String name, Integer edad);

}