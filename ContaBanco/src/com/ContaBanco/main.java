package com.ContaBanco;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o numero de sua Conta!");
		int conta = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Digite o numero de sua Agência!");
		String agencia = scanner.nextLine();

		System.out.println("Digite seu Nome!");
		String nome = scanner.nextLine();

		System.out.println("Digite seu Saldo!");
		Double saldo = scanner.nextDouble();
		
		scanner.close();

		ContaBanco user = new ContaBanco(conta, agencia, nome, saldo);

		System.out.println("Olá " + 
			user.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
			user.getAgencia() + ", conta " + 
			user.getNum() + " e seu saldo " +
			user.getSaldo() + " já está disponível para saque!");
	}


}
