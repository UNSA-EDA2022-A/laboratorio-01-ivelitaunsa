package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			//Modificando el arreglo para incluir el primer elemento como 0
            int a [] = new int [8];
            a[0] = 0;
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                //a[0] = 0, a[1] = sc.nextInt(), ...
                a[i+1] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {

		int posActual = a[0], limitcm = 50, saltos = 0;
		int restaP, sumaA = 0;
		if(verificarDistancias(a) == true) {
			for(int i=1; i<a.length;) {
				// restaP = a[1] - a[0], ...
				restaP = a[i] - posActual;
				// sumaA = 0 + restaP, ...
				sumaA = sumaA + restaP; 
				if(sumaA>limitcm) {
					posActual = a[i-1];
					sumaA = 0;
					saltos++;
				}else {
					posActual = a[i];
					i++;
				}
			}
			//verificarDistancias == true, el ultimo salto ya es posible
			saltos++;
			return saltos;
		}
		// TO DO
		return -1;
	}
	
	//Devuelve true si el conejo es capaz cruzar con exito
	public boolean verificarDistancias(int a[]) {
		int diferenciaParcial = 0;
		//La diferencia será de mayor a menor
		//a[7] - a[6], ... , a[1] - a[0];
		for(int i=a.length-1; i>0; i--) {
			diferenciaParcial = a[i] - a[i-1];
			if(!(diferenciaParcial<=50))
				return false;
		}
		return true;
	}
	
}