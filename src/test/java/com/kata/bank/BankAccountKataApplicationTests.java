package com.kata.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
	public void testGetAccount() {
		
		Account  account = bankAccountService.getAccount("fr792525234552252");
		
		assertEquals("fr792525234552252", account.getAccountNum());

	}

}
