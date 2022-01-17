package com.kata.bank.data;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "operation")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id", nullable = false)
	private String operationId;
	
	
    @Column(name = "amount", nullable = false)
	private double amount;
	
    @Column(name = "type", nullable = false)
	private String type;
	
    @Column(name = "date", nullable = false)
	private LocalDateTime operationDate;
	
    @Column(name = "account_num", nullable = false)
	private String accountNum;

	public String getOperationId() {
		return operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getOperationDate() {
		return operationDate;
	}
	public void setOperationDate(LocalDateTime operationDate) {
		this.operationDate = operationDate;
	}
	
	

}
