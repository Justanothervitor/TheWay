package theWayDefaultPackage;

import java.util.Scanner;
import TheWayHelper.HelperWithMath;

//Um programa que calcula a raiz quadrada baseado nos ideais de Pell

public class TheWayFour{
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		HelperWithMath helper = new HelperWithMath();
		
		//Variáveis inteiras que guardam um número digitado pelo usúario 
		//e também uma que guarda a resposta do cálculo
		int digitoDoUsuario,retornoDoCiclo; 
		
		System.out.println("Bem vindo ao programa que calcula a raiz de Pell");
		System.out.println("Por favor digite um numero!");
		digitoDoUsuario = sc.nextInt();
		retornoDoCiclo = helper.raizDePell(digitoDoUsuario);
		System.out.println("A raiz do número "+ digitoDoUsuario);
		System.out.println("Segundo as regras da Raiz de Pell eh "+retornoDoCiclo);
		
		sc.close();
		
	}
}