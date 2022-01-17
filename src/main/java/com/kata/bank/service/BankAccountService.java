package com.kata.bank.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kata.bank.data.Account;
import com.kata.bank.data.Operation;
import com.kata.bank.repository.AccountRepository;
import com.kata.bank.repository.OperationRepository;

@Service
public class BankAccountService {

	@Autowired
	AccountRepository accountRepository;
	
	
	@Autowired
	OperationRepository operationRepositoy;

	public Account deposit(double amount, Optional<Account> account) {


		if (account.isPresent()) {
			Operation op = new Operation();

			op.setAmount(amount);
			op.setOperationDate(LocalDateTime.now());
			op.setType("deposit");
			op.setAccountNum(account.get().getAccountNum());

			operationRepositoy.save(op);

			account.get().setTotalBalance(account.get().getTotalBalance() + amount);

			accountRepository.save(account.get());

			return account.get();
		}

		return null;

	}


	public Optional<Account> getAccountByNum(String accountNum) 
	{
		Optional<Account> account = accountRepository.findByAccountNum(accountNum);
		return account;

	}


}
