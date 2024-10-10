package com.ContaBanco;

public class ContaBanco {
	private int num;
	private String agencia;
	private String nomeCliente;
	private Double saldo;

	public ContaBanco(int num, String agencia, String nomeCliente, Double saldo){
		this.num = num;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNum(){
		return (this.num);
	}

	public String getAgencia(){
		return (this.agencia);
	}

	public String getNomeCliente(){
		return (this.nomeCliente);
	}

	public Double getSaldo(){
		return (this.saldo);
	}

}
