package com.kata.bank.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.kata.bank.data.Operation;



public interface OperationRepository extends JpaRepository<Operation, Integer> {
	

}
