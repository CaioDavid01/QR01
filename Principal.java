package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero");
		int num1 = scanner.nextInt();
		
        System.out.print("Digite o segundo numero");
		int num2 = scanner.nextInt();
		
		System.out.print("Digite o terceiro numero");
		int num3 = scanner.nextInt();
		
		System.out.print("Digite o quarto numero");
		int num4 = scanner.nextInt();
		
		int soma = num1 + num2+ num3 + num4;
		
		System.out.println("A soma dos numeros é:" + soma);
		
		

	}

}
