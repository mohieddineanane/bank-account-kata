package com.kata.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kata.bank.data.Account;
import com.kata.bank.data.Operation;
import com.kata.bank.service.BankAccountService;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
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
	
	@Test
	public void testWithdrawMoney() {
		
		Optional<Account>  account = bankAccountService.getAccountByNum("fr792525234552252");	
		Double oldBalance = account.get().getTotalBalance();
		try {
			bankAccountService.withdraw(2000, account);
			assertEquals(account.get().getTotalBalance(), oldBalance - 2000);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
		assertTrue(account.get().getTotalBalance()> 0.0);

	}
	
	@Test
	public void listOperation() {
		
		Optional<Account>  account = bankAccountService.getAccountByNum("fr792525234552252");	
		bankAccountService.deposit(500, account);
		try {
			bankAccountService.withdraw(300, account);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		
		List<Operation> operations = bankAccountService.history("fr792525234552252");
		log.info(operations.toString());

	}

}
