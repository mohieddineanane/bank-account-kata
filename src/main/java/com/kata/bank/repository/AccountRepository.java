package com.kata.bank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kata.bank.data.Account;



public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	Optional<Account> findByAccountNum(String name);
	
	
	
}
