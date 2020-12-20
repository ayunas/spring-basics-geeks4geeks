package com.geeks4geeks.springbasics;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Bank {

	@Id
	private String bankId; // -> bank_id

	@Column(length = 120)
	private String bankName; // -> bank_name

//	@OneToMany(mappedBy = "id")
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<User> users;

}
