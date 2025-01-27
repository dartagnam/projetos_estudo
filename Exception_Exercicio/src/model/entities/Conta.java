package model.entities;

import model.exceptions.BusinessException;

public class Conta {
	private Integer number;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {	
	}

	public Conta(Integer number, String titular, Double saldo, Double limiteSaque) {
		this.number = number;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		validacaoSaque(quantia);
		saldo -= quantia;
	}
	
	private void validacaoSaque(double quantia) {
		if(quantia > getLimiteSaque()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque!");
		}
		if(quantia > getSaldo()) {
			throw new BusinessException("Erro de saque: Saldo insuficiente!");
		}
		
	}	
	
	
	
}
