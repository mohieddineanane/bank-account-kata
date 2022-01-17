package com.kata.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kata.bank.data.Account;
import com.kata.bank.service.BankAccountService;

@SpringBootTest
class BankAccountKataApplicationTests {

	@Autowired
	private BankAccountService bankAccountService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testGetAccountByNum() {
		
		Optional<Account>  account = bankAccountService.getAccountByNum("fr792525234552252");	
		assertEquals("fr792525234552252", account.get().getAccountNum());

	}
	
	@Test
	public void testDepositMoney() {
		
		Optional<Account>  account = bankAccountService.getAccountByNum("fr792525234552252");	
		Double oldBalance = account.get().getTotalBalance();
		bankAccountService.deposit(500, account);
		
		assertEquals(account.get().getTotalBalance(), oldBalance+500);

	}

}
