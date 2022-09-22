package application;

import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = teclado.nextInt();
		
		teclado.nextLine();
		System.out.print("Enter account holder: ");
		String name = teclado.nextLine();
		
		Banco novo;
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char resposta = teclado.next().charAt(0);
		if(resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial = teclado.nextDouble();
			novo = new Banco(number, name, depositoInicial);
		} else {
			novo = new Banco(number, name);
		}

		System.out.println();
		
		System.out.println("Account data: ");
		System.out.print(novo.toString());
		

		System.out.println();
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposist = teclado.nextDouble();
		novo.deposit(deposist);		
		
		System.out.println("Updated account data: ");
		System.out.print(novo.toString());
		
		System.out.println();
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double saque = teclado.nextDouble();
		novo.withdraw(saque);
		
		System.out.println("Updated account data: ");
		System.out.print(novo.toString());
	}

}
