package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int[] digitos = devolverDigitos(a);
		int newNumber = 0, tamano = tamano(a);
		for(int i=0; i<digitos.length; i++) {
			//Si digito no es ni 0 ni 1 ni 2
			if(digitos[i] !=0 && digitos[i] !=1 && digitos[i] !=2) {
				return "El numero proporcionado no esta en base Gabriel.";
			}
			if(digitos[i]==2){
				if(i+1!=digitos.length) {
					for(int j=i+1; j<digitos.length; j++) {
						//Si los n digitos siguientes no son ceros
						if(digitos[j] !=0)
							return "El numero proporcionado no esta en base Gabriel.";
					}					
				}
			}
			newNumber = (int) (newNumber + digitos[i]*(Math.pow(2, tamano-1+1)-1));
			tamano--;
		}

		// TO DO
		return newNumber+"";
	}

	//Retorna un arreglo de enteros donde estaran los digitos
	public int[] devolverDigitos(int a) {
		int tamano = tamano(a), residuo = a;
		int[] digitos = new int[tamano];
		for(int i=0; i<digitos.length; i++) {
			//digitos[i] = abcde / 10^n-1 = a
			digitos[i] = (int) (residuo/Math.pow(10, tamano-1));
			//abcde = abcde % 10^n-1 = bcde
			residuo = (int) (residuo % Math.pow(10, tamano-1));
			tamano--;
		}
		return digitos;
	}

	//Retorna un entero que indica la cantidad de digitos que conforma el numero
	public int tamano(int a) {
		String number = Integer.toString(a);
		return number.length();
	}
}
