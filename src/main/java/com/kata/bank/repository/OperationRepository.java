package com.kata.bank.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kata.bank.data.Operation;



public interface OperationRepository extends JpaRepository<Operation, Integer> {
	
	List<Operation> findByAccountNum(String name);

}
