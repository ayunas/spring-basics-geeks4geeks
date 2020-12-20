package com.geeks4geeks.springbasics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iBankRepo extends JpaRepository<Bank,Integer> {

	@Override
	List<Bank> findAll();

	@Override
	Bank save(Bank b);

	//	@Query("SELECT b FROM Bank b where b.bankId=:bankId")
//	List<Bank> findBanksById2(String bankId);

//	@Query(value= "SELECT * FROM bank", nativeQuery = true)
//	List<Bank> findBigBanks();

//	1. JPQL - Java Persistence Query Language
//	2. Native SQL query

}
