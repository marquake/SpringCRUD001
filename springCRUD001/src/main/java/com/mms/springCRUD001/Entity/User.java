package com.mms.springCRUD001.Entity;

import com.mms.springCRUD001.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {
	
	@Id
	@GeneratedValue
	private long id;

	@Column(name="name")
	private String name;
	
	@Column(name="edad")
	private int age;

}