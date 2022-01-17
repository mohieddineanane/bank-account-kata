package com.kata.bank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kata.bank.data.Account;
import com.kata.bank.repository.AccountRepository;

@Service
public class BankAccountService {

	@Autowired
	AccountRepository accountRepository;


	public Account getAccount(String accountNum) 
	{
		Optional<Account> account = accountRepository.findByAccountNum(accountNum);
		return account.get();

	}


}
